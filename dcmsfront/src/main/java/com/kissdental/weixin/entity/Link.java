/**
\ * Copyright &copy; 2012-2013 <a href="http://www.jointem.com">Jointem</a> All rights reserved.
 */
package com.kissdental.weixin.entity;

import com.kissdental.weixin.common.Page;

import java.util.Date;

/**
 * 链接Entity
 * @author ThinkGem
 * @version 2013-05-15
 */
public class Link  {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private Category category;// 分类编号
	private String title;	// 链接名称
	private String color;	// 标题颜色（red：红色；green：绿色；blue：蓝色；yellow：黄色；orange：橙色）
	private String image;	// 链接图片
	private String href;	// 链接地址
	private Integer weight;	// 权重，越大越靠前
	private Date weightDate;// 权重期限，超过期限，将weight设置为0
	private Page<Link> page;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Link() {
		super();
		this.weight = 0;
	}
	
	public Link(String id){
		this();
		this.id = id;
	}

	public Link(Category category){
		this();
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Date getWeightDate() {
		return weightDate;
	}

	public void setWeightDate(Date weightDate) {
		this.weightDate = weightDate;
	}

	public Page<Link> getPage() {
		return page;
	}

	public void setPage(Page<Link> page) {
		this.page = page;
	}
}