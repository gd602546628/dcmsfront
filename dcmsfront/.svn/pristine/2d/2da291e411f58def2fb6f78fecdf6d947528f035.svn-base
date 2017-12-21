/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.dao;

import com.kissdental.weixin.entity.Office;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 机构DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
public interface OfficeDao {

	public Office get(String id);

	public Office get(Office entity);

	public List<Office> findAll();

	public List<Office> findList(Boolean isAll);

	public List<Office> findList(Office office);

	public List<Office> findAllList(Office entity);

	public List<Office> getListByLocation(@Param("lon") double lon, @Param("lat") double lat);

	public List<Office> getHospitalList();

	public List<Office> getByParentId(String pId);

	public List<Office> findByParentIdsLike(Office entity);
}
