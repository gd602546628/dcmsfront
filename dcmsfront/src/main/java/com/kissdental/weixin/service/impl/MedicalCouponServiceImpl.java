package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.MedicalCouponCustomerDao;
import com.kissdental.weixin.dao.MedicalCouponDao;
import com.kissdental.weixin.entity.MedicalCoupon;
import com.kissdental.weixin.entity.MedicalCouponCustomer;
import com.kissdental.weixin.service.MedicalCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by dartagnan on 2017/12/22.
 */
@Service("medicalCouponService")
public class MedicalCouponServiceImpl implements MedicalCouponService {
    @Autowired
    private MedicalCouponDao medicalCouponDao;
    @Autowired
    private MedicalCouponCustomerDao medicalCouponCustomerDao;

    @Override
    public MedicalCoupon get(String code){
        return medicalCouponDao.get(code);
    }

    @Override
    public List<MedicalCoupon> findListForActivity(MedicalCoupon medicalCoupon) {
        return medicalCouponDao.findListForActivity(medicalCoupon);
    }

    @Override
    public Page<MedicalCoupon> findPage(Page<MedicalCoupon> page, MedicalCoupon medicalCoupon, boolean isDataScopeFilter) {
        medicalCoupon.setPage(page);
        page.setList(merger(medicalCouponDao.findListForActivity(medicalCoupon),medicalCoupon));
        page.setTotalCount(medicalCouponDao.count(medicalCoupon));
        return page;
    }

    @Override
    public int update(MedicalCoupon medicalCoupon) {
        return medicalCouponDao.update(medicalCoupon);
    }

    public List<MedicalCoupon> merger(List<MedicalCoupon> list, MedicalCoupon medicalCoupon){
        MedicalCouponCustomer medicalCouponCustomer = new MedicalCouponCustomer();
        medicalCouponCustomer.setCustomerId(medicalCoupon.getCustomerId());
        List<MedicalCouponCustomer> mcclist = medicalCouponCustomerDao.findList(medicalCouponCustomer);
        for (MedicalCouponCustomer mcc :
                mcclist) {
            String couponCode = mcc.getCouponCode();
            for (MedicalCoupon mc:
                 list) {
                 if(mc.getCode().equals(couponCode)){
                     mc.setStatus("1");
                 }
            }
        }
        return list;
    }

}
