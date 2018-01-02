package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.common.Page;
import com.kissdental.weixin.dao.LinkDao;
import com.kissdental.weixin.entity.Link;
import com.kissdental.weixin.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dartagnan on 2017/12/25.
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkDao linkDao;
    @Override
    public List<Link> findList(Link entity) {
        return linkDao.findList(entity);
    }

    @Override
    public List<Link> findAllList(Link entity) {
        return linkDao.findAllList(entity);
    }

    @Override
    public Page<Link> findPage(Page<Link> page, Link link, boolean isDataScopeFilter) {
        link.setPage(page);
        page.setList(linkDao.findList(link));
        page.setTotalCount(linkDao.count(link));
        return page;
    }
}
