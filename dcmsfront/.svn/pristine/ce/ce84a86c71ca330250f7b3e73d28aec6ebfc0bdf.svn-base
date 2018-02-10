package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.DiagnosisResultDao;
import com.kissdental.weixin.entity.DiagnosisResult;
import com.kissdental.weixin.service.DiagnosisResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dartagnan on 2018/1/5.
 */
@Service("diagnosisResultService")
public class DiagnosisResultServiceImpl implements DiagnosisResultService {
    @Autowired
    private DiagnosisResultDao diagnosisResultDao;
    @Override
    public DiagnosisResult get(String id) {
        return diagnosisResultDao.get(id);
    }

    @Override
    public Page<DiagnosisResult> findPage(Page<DiagnosisResult> page, DiagnosisResult diagnosisResult, boolean isDataScopeFilter) {
        diagnosisResult.setPage(page);
        page.setList(diagnosisResultDao.findList(diagnosisResult));
        page.setTotalCount(diagnosisResultDao.count(diagnosisResult));
        return page;
    }
}
