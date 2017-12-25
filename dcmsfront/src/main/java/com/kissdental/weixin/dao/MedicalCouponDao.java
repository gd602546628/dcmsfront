package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.MedicalCoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/22.
 */
public interface MedicalCouponDao {

    public MedicalCoupon get(@Param("code") String code);

    public List<MedicalCoupon> findListForActivity(MedicalCoupon medicalCoupon);

    public int update(MedicalCoupon medicalCoupon);

    public int count(MedicalCoupon medicalCoupon);
}
