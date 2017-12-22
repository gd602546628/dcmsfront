package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.Customer;
import com.kissdental.weixin.entity.MedicalMaterial;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
public interface MedicalMaterialDao {
    public List<MedicalMaterial> findAllList(MedicalMaterial entity);
}
