package com.kissdental.weixin.service;

import com.kissdental.weixin.entity.ArticleData;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
public interface ArticleDataService {
    public ArticleData get(String id);

    public ArticleData get(ArticleData entity);

    public List<ArticleData> findAll();

    public List<ArticleData> findList(Boolean isAll);

    public List<ArticleData> findList(ArticleData entity);

    public List<ArticleData> findAllList(ArticleData entity);
}
