package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.common.RandomUtil;
import com.kissdental.weixin.entity.MedicalCoupon;
import com.kissdental.weixin.entity.MedicalCouponCustomer;
import com.kissdental.weixin.service.MedicalCouponCustomerService;
import com.kissdental.weixin.service.MedicalCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by dartagnan on 2017/12/23.
 */
@Controller
@RequestMapping("/MedicalCouponCustomer")
public class MedicalCouponCustomerController {
    @Autowired
    private MedicalCouponCustomerService medicalCouponCustomerService;

    @Autowired
    private MedicalCouponService medicalCouponService;

    @RequestMapping("/getCoupon")
    @ResponseBody
    public ApiResult getCoupon(MedicalCouponCustomer medicalCouponCustomer, HttpServletResponse response){
        ApiResult result = new ApiResult(response);
        if(medicalCouponCustomerService.hasNoCoupon(medicalCouponCustomer)){
            MedicalCoupon m = medicalCouponService.get(medicalCouponCustomer.getCouponCode());
            if(m.getRemain()>0){
                medicalCouponCustomer.preInsert();
                medicalCouponCustomer.setCode(RandomUtil.generateOnlyNumber( 9)+"");
                medicalCouponCustomer.setStatus("0");
                medicalCouponCustomerService.insert(medicalCouponCustomer);
                result.setCode(ApiResult.CODE_SUCCESS);
                result.setMesg("获取成功");
                result.setData(medicalCouponCustomer);
            }else {
                result.setCode(ApiResult.CODE_FAILURE);
                result.setMesg("优惠券已经被抢空");
            }
        }else{
            result.setCode(ApiResult.CODE_FAILURE);
            result.setMesg("您已领取过该优惠券");
        }
        return result;
    }

    @RequestMapping("/findMyCoupon")
    @ResponseBody
    public ApiResult findMyCoupon(MedicalCouponCustomer medicalCouponCustomer, HttpServletRequest request,HttpServletResponse response){
        ApiResult result = new ApiResult(response);
        try {
            Page<MedicalCouponCustomer> page = medicalCouponCustomerService.findPage(new Page<MedicalCouponCustomer>(request, response), medicalCouponCustomer, true);
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
