package com.kissdental.weixin.service;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.entity.MedicalCoupon;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/22.
 */

public interface MedicalCouponService {

    public MedicalCoupon get(String code);

    public List<MedicalCoupon> findListForActivity(MedicalCoupon medicalCoupon);

    public Page<MedicalCoupon> findPage(Page<MedicalCoupon> page, MedicalCoupon medicalCoupon, boolean isDataScopeFilter);

    public int update(MedicalCoupon medicalCoupon);
}
