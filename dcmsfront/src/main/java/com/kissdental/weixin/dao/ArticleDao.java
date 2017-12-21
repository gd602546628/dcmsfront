package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.Article;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/20.
 */
public interface ArticleDao {
    public Article get(String id);

    public Article get(Article entity);

    public List<Article> findAll();

    public List<Article> findList(Boolean isAll);

    public List<Article> findList(Article entity);

    public List<Article> findAllList(Article entity);
}
