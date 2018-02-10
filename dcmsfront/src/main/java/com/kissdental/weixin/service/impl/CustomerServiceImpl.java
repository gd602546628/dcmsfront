package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.CustomerDao;
import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by dartagnan on 2017/12/19.
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer getCustomerByPhone(String phone) {
        return customerDao.getCustomerByPhone(phone);
    }

    @Override
    public void register(Customer customer){
        String id = UUID.randomUUID().toString().replace("-","");
        String code = System.currentTimeMillis()+"";
        customer.setId(id);
        customer.setCode(code);
        customer.setCreateDate(new Date());
        customerDao.save(customer);
    }

    @Override
    public int update(Customer customer){
        return customerDao.update(customer);
    }

    @Override
    public Customer get(String id){
        return customerDao.get(id);
    }

    @Override
    public boolean checkPhoneNumbers(String phone) {
        return customerDao.checkPhoneNumbers(phone)>0?false:true;
    }
}
