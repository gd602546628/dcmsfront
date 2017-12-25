package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.MedicalCouponCustomer;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/22.
 */
public interface MedicalCouponCustomerDao {

    public int insert(MedicalCouponCustomer medicalCouponCustomer);

    public List<MedicalCouponCustomer> checkCoupon(MedicalCouponCustomer medicalCouponCustomer);

    public List<MedicalCouponCustomer> findList(MedicalCouponCustomer medicalCouponCustomer);

    public int count(MedicalCouponCustomer medicalCouponCustomer);
}
