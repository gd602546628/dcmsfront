package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.MedicalCouponCustomerDao;
import com.kissdental.weixin.dao.MedicalCouponDao;
import com.kissdental.weixin.entity.MedicalCoupon;
import com.kissdental.weixin.entity.MedicalCouponCustomer;
import com.kissdental.weixin.service.MedicalCouponCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/23.
 */
@Service("medicalCouponCustomerService")
public class MedicalCouponCustomerServiceImpl implements MedicalCouponCustomerService {
    @Autowired
    private MedicalCouponCustomerDao medicalCouponCustomerDao;
    @Autowired
    private MedicalCouponDao medicalCouponDao;

    @Override
    public int insert(MedicalCouponCustomer medicalCouponCustomer) {
        medicalCouponDao.update(new MedicalCoupon(medicalCouponCustomer.getCouponCode()));
        return medicalCouponCustomerDao.insert(medicalCouponCustomer);
    }

    @Override
    public List<MedicalCouponCustomer> findList(MedicalCouponCustomer medicalCouponCustomer) {
        return medicalCouponCustomerDao.findList(medicalCouponCustomer);
    }

    @Override
    public Page<MedicalCouponCustomer> findPage(Page<MedicalCouponCustomer> page, MedicalCouponCustomer medicalCouponCustomer, boolean isDataScopeFilter) {
        medicalCouponCustomer.setPage(page);
        page.setList(medicalCouponCustomerDao.findList(medicalCouponCustomer));
        page.setTotalCount(medicalCouponCustomerDao.count(medicalCouponCustomer));
        return page;
    }

    @Override
    public boolean hasNoCoupon(MedicalCouponCustomer medicalCouponCustomer) {
        List<MedicalCouponCustomer> list = medicalCouponCustomerDao.checkCoupon(medicalCouponCustomer);
        return list.size()==0?true:false;
    }


}
