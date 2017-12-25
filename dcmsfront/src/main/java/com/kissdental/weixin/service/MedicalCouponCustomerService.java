package com.kissdental.weixin.service;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.entity.MedicalCoupon;
import com.kissdental.weixin.entity.MedicalCouponCustomer;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/23.
 */
public interface MedicalCouponCustomerService {

    public int insert(MedicalCouponCustomer medicalCouponCustomer);

    public Page<MedicalCouponCustomer> findPage(Page<MedicalCouponCustomer> page, MedicalCouponCustomer medicalCouponCustomer, boolean isDataScopeFilter);

    public List<MedicalCouponCustomer> findList(MedicalCouponCustomer medicalCouponCustomer);

    public boolean hasNoCoupon(MedicalCouponCustomer medicalCouponCustomer);
}
