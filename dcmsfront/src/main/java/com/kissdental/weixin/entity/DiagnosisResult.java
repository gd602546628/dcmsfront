/**
 * Copyright &copy; 2012-2016 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kissdental.weixin.common.Page;

import java.util.Date;

/**
 * 诊疗项结果表Entity
 * @author Dartagnan
 * @version 2017-11-30
 */
public class DiagnosisResult {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Date date;
	private String name;		// 类型
	private String diagnosisId;		// 诊疗id
	private String content;		// 检查结果数据串
	private String customerId; //病患id
	private Date createDate;  //就诊日期
	private Page<DiagnosisResult> page;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(String diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Page<DiagnosisResult> getPage() {
		return page;
	}

	public void setPage(Page<DiagnosisResult> page) {
		this.page = page;
	}
}