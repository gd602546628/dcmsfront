package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.entity.MedicalCoupon;
import com.kissdental.weixin.service.MedicalCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by dartagnan on 2017/12/22.
 */
@Controller
@RequestMapping("/MedicalCoupon")
public class MedicalCouponController {
    @Autowired
    private MedicalCouponService medicalCouponService;

    @RequestMapping("/getCounponList")
    @ResponseBody
    public ApiResult getCouponList(HttpServletResponse response, HttpServletRequest request,String customerId){
        ApiResult result = new ApiResult(response);
        try {
            Page<MedicalCoupon> page = medicalCouponService.findPage(new Page<MedicalCoupon>(request, response), new MedicalCoupon(customerId,true).setNow(new Date()), true);
            result.setPageData(page);
            result.setMesg("查询成功");
            result.setCode(ApiResult.CODE_SUCCESS);
        } catch (Exception e) {
            result.setCode(ApiResult.CODE_FAILURE);
            result.setMesg("查询失败");
        }
        return result;
    }
}
