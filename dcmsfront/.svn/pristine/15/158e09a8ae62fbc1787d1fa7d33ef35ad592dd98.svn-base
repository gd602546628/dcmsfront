package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.MedicalServiceDao;
import com.kissdental.weixin.entity.MedicalService;
import com.kissdental.weixin.service.MedicalServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("medicalServiceService")
public class MedicalServiceServiceImpl implements MedicalServiceService {
    @Autowired
    private MedicalServiceDao medicalServiceDao;

    @Override
    public List<MedicalService> findAllList() {
        return medicalServiceDao.findAllList(new MedicalService());
    }
}
