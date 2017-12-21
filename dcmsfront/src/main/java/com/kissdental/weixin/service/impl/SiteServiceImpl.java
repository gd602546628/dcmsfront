package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.SiteDao;
import com.kissdental.weixin.entity.Site;
import com.kissdental.weixin.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/21.
 */
@Service("siteService")
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteDao siteDao;
    @Override
    public Site get(String id) {
        return siteDao.get(id);
    }

    @Override
    public Site get(Site entity) {
        return siteDao.get(entity);
    }

    @Override
    public List<Site> findAll() {
        return siteDao.findAllList(new Site());
    }

    @Override
    public List<Site> findList(Boolean isAll) {
        return null;
    }

    @Override
    public List<Site> findList(Site entity) {
        return siteDao.findList(entity);
    }

    @Override
    public List<Site> findAllList(Site entity) {
        return siteDao.findAllList(entity);
    }
}
