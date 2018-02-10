package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.DiagnosisPay;

import java.util.List;

/**
 * Created by dartagnan on 2018/1/4.
 */
public interface DiagnosisPayDao {

    public DiagnosisPay get(String id);

    public List<DiagnosisPay> findList(DiagnosisPay diagnosisPay);

    public int count(DiagnosisPay diagnosisPay);
}
