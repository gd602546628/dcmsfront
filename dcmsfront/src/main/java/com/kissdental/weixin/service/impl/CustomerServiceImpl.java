package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.CustomerDao;
import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
