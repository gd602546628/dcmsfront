/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kissdental.weixin.common.Page;

import java.util.Date;

/**
 * 收费记录Entity
 * @author lihm
 * @version 2017-12-12
 */
public class DiagnosisPay  {
	
	private static final long serialVersionUID = 1L;
//	private Diagnosis diagnosis;		// 诊疗id
	private String id;
	private String schemeName; //方案名称
	private Double pay;		// 当次付费
	private String payType;		// 付费方式
	private Date payDate;		//付费时间
	private String customerId; //病患id
	private Page<DiagnosisPay> page;
//	public Diagnosis getDiagnosis() {
//		return diagnosis;
//	}
//
//	public void setDiagnosis(Diagnosis diagnosis) {
//		this.diagnosis = diagnosis;
//	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPay() {
		return pay;
	}

	public void setPay(Double pay) {
		this.pay = pay;
	}
	
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Page<DiagnosisPay> getPage() {
		return page;
	}

	public void setPage(Page<DiagnosisPay> page) {
		this.page = page;
	}
}