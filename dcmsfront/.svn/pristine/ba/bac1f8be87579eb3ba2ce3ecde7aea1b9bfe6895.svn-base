/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 医疗服务Entity
 * @author dartagnan
 * @version 2017-11-08
 */
public class MedicalService  {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;		// 服务名称
	private double price;		// 服务价格
	private String category;  	//服务分类
	private String operator;	//操作人员 0:医生 1:助手
	private double minimum;
	private double maximum;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@JsonIgnore
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public double getMinimum() {
		return minimum;
	}

	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
}