package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.entity.MedicalMaterial;
import com.kissdental.weixin.entity.MedicalService;
import com.kissdental.weixin.service.MedicalMaterialService;
import com.kissdental.weixin.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Controller
@RequestMapping("/medicalResource")
public class MedicalResourceController {

    @Autowired
    private MedicalMaterialService medicalMaterialService;
    @Autowired
    private MedicalServiceService medicalServiceService;


    @ResponseBody
    @RequestMapping("/getAll")
    public ApiResult getAll(HttpServletResponse response){
        ApiResult result = new ApiResult(response);
        try {
            Map map = new HashMap();
            map.put("allMaterial",getList(getMaterialCategory(medicalMaterialService.findAllList())));
            map.put("allService", getList(getServiceCategory(medicalServiceService.findAllList())));
            result.setData(map);
            result.setCode(ApiResult.CODE_SUCCESS);
            result.setMesg("查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ApiResult.CODE_FAILURE);
            result.setMesg("查询失败");
        }

        return result;

    }

    public Map getMaterialCategory(List<MedicalMaterial> list){
        Map<String,List<MedicalMaterial>> map = new HashMap();
        for (MedicalMaterial m:list
                ) {
            if(map.get(m.getCategory())==null){
                List<MedicalMaterial> tempList = new ArrayList<MedicalMaterial>();
                tempList.add(m);
                map.put(m.getCategory(),tempList);
            }else{
                map.get(m.getCategory()).add(m);
            }
        }
        return map;
    }

    public Map getServiceCategory(List<MedicalService> list){
        Map<String,List<MedicalService>> map = new HashMap();
        for (MedicalService m:list
                ) {
            if(map.get(m.getCategory())==null){
                List<MedicalService> tempList = new ArrayList<MedicalService>();
                tempList.add(m);
                map.put(m.getCategory(),tempList);
            }else{
                map.get(m.getCategory()).add(m);
            }
        }
        return map;
    }

    public List<Map> getList(Map map){
        List<Map> list = new ArrayList<Map>();
        for (Object key :
                map.keySet()) {
            Map m = new HashMap();
            m.put("category",getCategory(key.toString()));
            m.put("list",map.get(key));
            list.add(m);
        }
        return list;
    }

    public String getCategory(String s){
        String result = "";
        switch (s){
            case "1":result = "口腔麻醉科";break;
            case "2":result = "口腔内科";break;
            case "3":result = "口腔外科";break;
            case "4":result = "口腔修复科";break;
            case "5":result = "口腔正畸科";break;
            case "6":result = "口腔美容科";break;
            case "7":result = "其他";break;
            default:break;
        }
        return result;
    }
}
