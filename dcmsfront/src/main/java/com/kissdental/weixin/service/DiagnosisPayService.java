package com.kissdental.weixin.service;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.entity.DiagnosisPay;
import com.kissdental.weixin.entity.DiagnosisResult;

/**
 * Created by dartagnan on 2018/1/5.
 */
public interface DiagnosisPayService {

    public DiagnosisPay get(String id);

    public Page<DiagnosisPay> findPage(Page<DiagnosisPay> page, DiagnosisPay diagnosisPay, boolean isDataScopeFilter);

}
