package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.ArticleDataDao;
import com.kissdental.weixin.entity.ArticleData;
import com.kissdental.weixin.service.ArticleDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("articleDataService")
public class ArticleDataServiceImpl implements ArticleDataService {
    @Autowired
    private ArticleDataDao articleDataDao;
    @Override
    public ArticleData get(String id) {
        return articleDataDao.get(id);
    }

}
