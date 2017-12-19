package com.kissdental.weixin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * 用户主表Entity
 * @author dartagnan
 * @version 2017-11-23
 */
public class Customer {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;		// 病历号
	private String name;		// 姓名
	private String sex;		// 性别：1男，2女
	private Date birthday;		// 出生日期
	private String phone;		// 手机
	private String password;		// 密码
	private String nationality;		// 国籍
	private String tel;		// 座机号码
	private String photo;		// 用户头像
	private String address;		// 家庭地址
	private String work;		// 工作单位
	private String workOccupation;		// 职业
	private String workPhone;		// 单位电话
	private String fax;		// 传真
	private String email;		// 电子邮件
	private String isAdult;		// 是否成年，0否，1是
	private String source;		// 来源
	private Customer recommender;		// 推荐人id
	private Integer age;		// 年龄，根据出生日期计算
	private String delFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public String getWorkOccupation() {
		return workOccupation;
	}

	public void setWorkOccupation(String workOccupation) {
		this.workOccupation = workOccupation;
	}
	
	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@JsonBackReference
	public Customer getRecommender() {
		return recommender;
	}

	public void setRecommender(Customer recommender) {
		this.recommender = recommender;
	}

	public Integer getAge() throws Exception {
		return getAge(this.birthday);
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public  int getAge(Date birthDay) throws Exception {
		Calendar cal = Calendar.getInstance();

		if (cal.before(birthDay)) {
			throw new IllegalArgumentException(
					"The birthDay is before Now.It's unbelievable!");
		}
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
		cal.setTime(birthDay);

		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

		int age = yearNow - yearBirth;

		if (monthNow <= monthBirth) {
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth) age--;
			}else{
				age--;
			}
		}
		return age;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
}