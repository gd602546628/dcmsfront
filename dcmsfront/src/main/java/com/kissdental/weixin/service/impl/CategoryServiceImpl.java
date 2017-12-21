package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.CategoryDao;
import com.kissdental.weixin.entity.Category;
import com.kissdental.weixin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public Category get(String id) {
        return categoryDao.get(id);
    }

    @Override
    public Category get(Category entity) {
        return categoryDao.get(entity);
    }

    @Override
    public List<Category> findList(Boolean isAll) {
        return null;
    }

    @Override
    public List<Category> findList(Category entity) {
        return categoryDao.findList(entity);
    }

}
