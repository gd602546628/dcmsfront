package com.kissdental.weixin.controller;

import com.kissdental.weixin.common.ApiResult;
import com.kissdental.weixin.common.JsonMapper;
import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.service.CustomerService;
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
    public ApiResult getCustoerInfo(HttpServletResponse response,String phone){
        ApiResult result = new ApiResult(response);
        Customer customer = customerService.getCustomerByPhone(phone);
        result.setCode(ApiResult.CODE_SUCCESS);
        result.setMesg("查询成功");
        result.setData(customer);
        return result;
    }

}
