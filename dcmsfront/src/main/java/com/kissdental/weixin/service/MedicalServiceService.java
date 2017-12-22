package com.kissdental.weixin.service;

import com.kissdental.weixin.dao.MedicalServiceDao;
import com.kissdental.weixin.entity.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("medicalServiceService")
public interface MedicalServiceService {

    public List<MedicalService> findAllList();
}
