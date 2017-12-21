package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.Site;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/20.
 */
public interface SiteDao {
    public Site get(String id);

    public Site get(Site entity);

    public List<Site> findList(Site entity);

    public List<Site> findAllList(Site entity);
}
