/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kissdental.weixin.common.Page;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * 优惠卷Entity
 * @author dartagnan
 * @version 2017-11-23
 */
public class MedicalCoupon  {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;		// 优惠券编码
	private String type;		// 类型
	private String name;		// 优惠券名称
	private String image;		// 优惠券图片
	private double worth;		// 优惠券价值
	private int total;		// 优惠券总数
	private int remain;		// 优惠券剩余
	private Date startTime;		// 有效期开始时间
	private Date endTime;		// 有效期结束时间
	private String premise;		// 使用说明
	private float discount;		//折扣
	private double fullReduce; //满减封顶值
	private Date now;			//现在时间
	private Page<MedicalCoupon> page;
	private String customerId;
	private String status;

	public MedicalCoupon() {
	}

	public MedicalCoupon(String customerId,boolean isCus){
		if(isCus){
			this.customerId = customerId;
		}
	}
	public MedicalCoupon(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getWorth() {
		return worth;
	}

	public void setWorth(double worth) {
		this.worth = worth;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPremise() {
		return premise;
	}

	public void setPremise(String premise) {
		this.premise = premise;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@JsonIgnore
	public Page<MedicalCoupon> getPage() {
		return page;
	}

	public void setPage(Page<MedicalCoupon> page) {
		this.page = page;
	}
	@JsonIgnore
	public Date getNow() {
		return now;
	}

	public MedicalCoupon setNow(Date now) {
		this.now = now;
		return this;
	}
	@JsonIgnore
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		if(StringUtils.isEmpty(status)){
			setStatus("0");
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}