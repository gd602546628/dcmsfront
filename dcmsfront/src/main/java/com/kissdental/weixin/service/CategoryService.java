package com.kissdental.weixin.service;

import com.kissdental.weixin.entity.Category;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
public interface CategoryService {
    public Category get(String id);

    public Category get(Category entity);


    public List<Category> findList(Boolean isAll);

    public List<Category> findList(Category entity);

}
