package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.ArticleDao;
import com.kissdental.weixin.dao.CategoryDao;
import com.kissdental.weixin.entity.Article;
import com.kissdental.weixin.entity.Category;
import com.kissdental.weixin.service.ArticleService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private CategoryDao categoryDao;
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

    @Override
    public Page<Article> findPage(Page<Article> page, Article article, boolean isDataScopeFilter) {
        if (article.getCategory()!=null && StringUtils.isNotBlank(article.getCategory().getId()) && !Category.isRoot(article.getCategory().getId())){
            Category category = categoryDao.get(article.getCategory().getId());
            if (category==null){
                category = new Category();
            }
            category.setParentIds(category.getId());
            category.setSite(category.getSite());
            article.setCategory(category);
        }
        else{
            article.setCategory(new Category());
        }
        article.setPage(page);
        page.setList(articleDao.findList(article));
        page.setTotalCount(articleDao.count(article));
        return page;

    }
}
