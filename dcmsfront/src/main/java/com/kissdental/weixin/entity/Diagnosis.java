/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import java.util.Date;

/**
 * 诊疗主表Entity
 * @author lihm
 * @version 2017-11-30
 */
public class Diagnosis {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Customer customer;		// 客户id
	private DiagnosisResult healthResult;		// 健康状况检查结果
	private DiagnosisResult dentalResult;		// 口腔检查结果
	private DiagnosisResult consentlResult;		// 治疗同意书结果id
	private DiagnosisResult recordResult;		// 治疗记录结果ids
	private DiagnosisResult completionResult;		// 治疗完成结果ids
	private Double price;		// 诊疗价格
	private Double vipRatio;		// vip扣减比例
	private Double vipPrice;		// vip等级扣减价格
	private Double discountRatio;		// 最高折扣扣减比例
	private Double discountPrice;		// 最高折扣扣减价格
	private Integer scoreDeduction;		// 积分扣减
	private Double scorePrice;		// 积分扣减价格
	private String couponCode;		// 优惠券编码
	private Double couponPrice;		// 优惠券扣减价格
	private Double finalPrice;		// 最终收费价格
	private Double alreadyPay;		// 已收费
	private Double leftPay;		// 欠费
	private String status;		// 流程状态:0前台已添加客户，待分诊，1分诊完成，待诊疗，2诊疗完成，待付款，3付款完成，待复诊，4付款完成，结束流程
	private String curType;		// 当前操作类型
	private String handleName;		// 当前待操作用户
	private Office handleOffice;		// 当前待操作用户所在科室

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHandleName() {
		return handleName;
	}

	public void setHandleName(String handleName) {
		this.handleName = handleName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public DiagnosisResult getHealthResult() {
		return healthResult;
	}

	public void setHealthResult(DiagnosisResult healthResult) {
		this.healthResult = healthResult;
	}
	
	public DiagnosisResult getDentalResult() {
		return dentalResult;
	}

	public void setDentalResult(DiagnosisResult dentalResult) {
		this.dentalResult = dentalResult;
	}
	
	public DiagnosisResult getConsentlResult() {
		return consentlResult;
	}

	public void setConsentlResult(DiagnosisResult consentlResult) {
		this.consentlResult = consentlResult;
	}
	
	public DiagnosisResult getRecordResult() {
		return recordResult;
	}

	public void setRecordResult(DiagnosisResult recordResult) {
		this.recordResult = recordResult;
	}
	
	public DiagnosisResult getCompletionResult() {
		return completionResult;
	}

	public void setCompletionResult(DiagnosisResult completionResult) {
		this.completionResult = completionResult;
	}
	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

	public Double getVipRatio() {
		return vipRatio;
	}

	public void setVipRatio(Double vipRatio) {
		this.vipRatio = vipRatio;
	}
	
	public Double getVipPrice() {
		return vipPrice;
	}

	public void setVipPrice(Double vipPrice) {
		this.vipPrice = vipPrice;
	}
	

	public Double getDiscountRatio() {
		return discountRatio;
	}

	public void setDiscountRatio(Double discountRatio) {
		this.discountRatio = discountRatio;
	}
	
	public Double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public Integer getScoreDeduction() {
		return scoreDeduction;
	}

	public void setScoreDeduction(Integer scoreDeduction) {
		this.scoreDeduction = scoreDeduction;
	}
	
	public Double getScorePrice() {
		return scorePrice;
	}

	public void setScorePrice(Double scorePrice) {
		this.scorePrice = scorePrice;
	}
	
	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	
	public Double getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(Double couponPrice) {
		this.couponPrice = couponPrice;
	}
	
	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurType() {
		return curType;
	}

	public void setCurType(String curType) {
		this.curType = curType;
	}


	public Office getHandleOffice() {
		return handleOffice;
	}

	public void setHandleOffice(Office handleOffice) {
		this.handleOffice = handleOffice;
	}

	public Double getAlreadyPay() {
		return alreadyPay;
	}

	public void setAlreadyPay(Double alreadyPay) {
		this.alreadyPay = alreadyPay;
	}

	public Double getLeftPay() {
		return leftPay;
	}

	public void setLeftPay(Double leftPay) {
		this.leftPay = leftPay;
	}

}