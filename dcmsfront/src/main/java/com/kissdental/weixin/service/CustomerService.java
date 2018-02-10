package com.kissdental.weixin.service;

import com.kissdental.weixin.entity.Customer;

/**
 * Created by dartagnan on 2017/12/19.
 */
public interface CustomerService {
    public Customer getCustomerByPhone(String phone);

    public void register(Customer customer);

    public int update(Customer customer);

    public Customer get(String id);

    public boolean checkPhoneNumbers(String phone);
}
