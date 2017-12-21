/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.service;

import com.kissdental.weixin.entity.Office;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 机构Service
 * @author Dartagnan
 * @version 2017-9-29
 */
public interface OfficeService  {

	public List<Office> findAll();

	public List<Office> findList(Office office);

	public List<Office> getListByLocation(double lon,double lat);

	public List<Office> getHospitalList();

	public List<Office> getByParentId(String pId);
}
