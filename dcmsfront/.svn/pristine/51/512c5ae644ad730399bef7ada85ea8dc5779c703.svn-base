/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang.StringUtils;

/**
 * 医疗物资Entity
 * @author dartagnan
 * @version 2017-11-09
 */
public class MedicalMaterial  {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;		// 物料名称
	private double price;		// 物料价格
	private int inventory;		// 库存数量
	private String description;		// 描述
	private String unit;		// 计量单位
	private String standard;		// 规格
	private String category;      //分类
	private int amount;    		//数量
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

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getCategory() {
		if(StringUtils.isNotEmpty(category)){
			switch (category){
//				case "1"
			}
		}
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
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