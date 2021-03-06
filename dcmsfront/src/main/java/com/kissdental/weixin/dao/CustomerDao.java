/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.Customer;

import java.util.List;


public interface CustomerDao  {

    public Customer getCustomerByPhone(String phone);

    public Customer get(String id);

    public Customer get(Customer entity);

    public List<Customer> findAll();

    public List<Customer> findList(Customer office);

    public List<Customer> findAllList(Customer entity);

    public void save(Customer customer);

    public int update(Customer customer);

    public int checkPhoneNumbers(String phone);
}