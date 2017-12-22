package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.MedicalMaterialDao;
import com.kissdental.weixin.entity.MedicalMaterial;
import com.kissdental.weixin.service.MedicalMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("medicalMaterialService")
public class MedicalMaterialServiceImpl implements MedicalMaterialService {
    @Autowired
    private MedicalMaterialDao medicalMaterialDao;

    @Override
    public List<MedicalMaterial> findAllList() {
        return medicalMaterialDao.findAllList(new MedicalMaterial());
    }
}
