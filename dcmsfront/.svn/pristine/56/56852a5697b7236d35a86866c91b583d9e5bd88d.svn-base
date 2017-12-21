/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.service.impl;

import com.kissdental.weixin.dao.OfficeDao;
import com.kissdental.weixin.entity.Office;
import com.kissdental.weixin.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 机构Service
 * @author Dartagnan
 * @version 2017-9-29
 */
@Service("officeService")
public class OfficeServiceImpl implements OfficeService {

	@Autowired
	private OfficeDao officeDao;

	public List<Office> findAll(){
		return officeDao.findAllList(new Office());
	}

	public List<Office> findList(Office office){
		if(office != null){
			office.setParentIds(office.getParentIds()+"%");
			return officeDao.findByParentIdsLike(office);
		}
		return  new ArrayList<Office>();
	}

	public List<Office> getListByLocation(double lon,double lat){
		return officeDao.getListByLocation(lon,lat);
	};

	public List<Office> getHospitalList(){return officeDao.getHospitalList();}

	public List<Office> getByParentId(String pId){
		List<Office> list = officeDao.getByParentId(pId);
		return list;
	};
}
