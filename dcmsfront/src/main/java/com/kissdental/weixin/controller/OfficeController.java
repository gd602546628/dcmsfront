package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.entity.Office;
import com.kissdental.weixin.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dartagnan on 2017/12/20.
 */
@Controller
@RequestMapping("/office")
public class OfficeController {
    @Autowired
    private OfficeService officeService;

    @ResponseBody
    @RequestMapping(value="/getAllList")
    public ApiResult getHospitalList(HttpServletResponse response){
        ApiResult result = new ApiResult(response);
        result.setCode(ApiResult.CODE_SUCCESS);
        result.setMesg("查询成功");
        result.setData(officeService.findAll());
        return  result;
    }

}
