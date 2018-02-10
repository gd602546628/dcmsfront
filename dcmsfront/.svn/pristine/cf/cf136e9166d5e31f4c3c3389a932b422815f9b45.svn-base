package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.DiagnosisPayDao;
import com.kissdental.weixin.entity.DiagnosisPay;
import com.kissdental.weixin.service.DiagnosisPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dartagnan on 2018/1/5.
 */
@Service("diagnosisPayService")
public class DiagnosisPayServiceImpl implements DiagnosisPayService{

    @Autowired
    private DiagnosisPayDao diagnosisPayDao;
    @Override
    public DiagnosisPay get(String id) {
        return diagnosisPayDao.get(id);
    }

    /**
     * 消费记录
     * @param page
     * @param diagnosisPay
     * @param isDataScopeFilter
     * @return
     */
    @Override
    public Page<DiagnosisPay> findPage(Page<DiagnosisPay> page, DiagnosisPay diagnosisPay, boolean isDataScopeFilter) {
        diagnosisPay.setPage(page);
        page.setList(diagnosisPayDao.findList(diagnosisPay));
        page.setTotalCount(diagnosisPayDao.count(diagnosisPay));
        return page;
    }


}
