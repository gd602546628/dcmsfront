package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.ArticleDao;
import com.kissdental.weixin.entity.Article;
import com.kissdental.weixin.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public Article get(String id) {
        return articleDao.get(id);
    }

    @Override
    public Article get(Article entity) {
        return articleDao.get(entity);
    }

    @Override
    public List<Article> findAll() {
        return articleDao.findAllList(new Article());
    }

    @Override
    public List<Article> findList(Boolean isAll) {
        return null;
    }

    @Override
    public List<Article> findList(Article entity) {
        return articleDao.findList(entity);
    }

    @Override
    public List<Article> findAllList(Article entity) {
        return articleDao.findAllList(entity);
    }
}
