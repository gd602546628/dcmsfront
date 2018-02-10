package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.common.CombineBeans;
import com.kissdental.weixin.common.JsonMapper;
import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.service.CustomerService;
import com.kissdental.weixin.vo.CustomerVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dartagnan on 2017/12/19.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    private JsonMapper mapper = JsonMapper.getInstance();

    @ResponseBody
    @RequestMapping(value="/getInfo")
    public ApiResult getCustomerInfo(HttpServletResponse response,String id){
        ApiResult result = new ApiResult(response);
        Customer customer = customerService.get(id);
        CustomerVO vo = new CustomerVO();
        vo.setId(customer.getId());
        vo.setCode(customer.getCode());
        vo.setName(customer.getName());
        vo.setPhone(customer.getPhone());
        vo.setSex(customer.getSex());
        vo.setOutpatientQrcode(customer.getOutpatientQrcode());
        vo.setReferrerQrcode(customer.getReferrerQrcode());
        result.setCode(ApiResult.CODE_SUCCESS);
        result.setMesg("查询成功");
        result.setData(vo);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public ApiResult update(Customer customer,HttpServletResponse response){
        ApiResult result = new ApiResult(response);
        try {
            Customer target = customerService.get(customer.getId());
            target=(Customer) CombineBeans.combineSydwCore(customer,target);
            customerService.update(target);
            result.setCode(ApiResult.CODE_SUCCESS);
            result.setMesg("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ApiResult.CODE_FAILURE);
            result.setMesg("修改失败");
        }
        return result;
    }
}
