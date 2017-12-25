/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kissdental.weixin.common.Page;

import java.util.UUID;

/**
 * 优惠券生成Entity
 * @author dartagnan
 * @version 2017-12-22
 */
public class MedicalCouponCustomer {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String customerId;		// 客户id
	private String couponCode;		// 优惠券编码
	private String code;		// 领到的优惠券编码
	private String status;		// 状态:0未使用，1已使用，2删除
	private String name;
	private String type;
	private int worth;
	private float discount;
	private double fullReduce;
	private Page<MedicalCouponCustomer> page;

	public MedicalCouponCustomer(){

	}

	public MedicalCouponCustomer(String couponCode) {
		preInsert();
		this.couponCode = couponCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void preInsert(){
		id = UUID.randomUUID().toString().replace("-","");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWorth() {
		return worth;
	}

	public void setWorth(int worth) {
		this.worth = worth;
	}

	@JsonIgnore
	public Page<MedicalCouponCustomer> getPage() {
		return page;
	}

	public void setPage(Page<MedicalCouponCustomer> page) {
		this.page = page;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public double getFullReduce() {
		return fullReduce;
	}

	public void setFullReduce(double fullReduce) {
		this.fullReduce = fullReduce;
	}
}