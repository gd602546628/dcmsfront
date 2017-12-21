package com.kissdental.weixin.service;

import com.kissdental.weixin.entity.Site;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
public interface SiteService {
    public Site get(String id);

    public Site get(Site entity);

    public List<Site> findAll();

    public List<Site> findList(Boolean isAll);

    public List<Site> findList(Site entity);

    public List<Site> findAllList(Site entity);
}
