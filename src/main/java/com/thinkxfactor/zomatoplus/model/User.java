package com.thinkxfactor.zomatoplus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.TrueFalseType;
@Entity
@Table(name="tbl_user")
public class User implements Serializable 
{
	@Id//primary key
	@GeneratedValue //id incremented
	@Column(name="user_id")
	private Long id;
	
	@Column(name="name", unique=true)
	private Long name;
	
	@Column(name="type")
	private Long type;
	
	@Column(name="mobile")
	private Long mobile;
	
	@Column(name="pasword")
	private String password;
	
	@Column(name="landmark")
	private Long landmark;
	
	
	@Column(name="city")
	private String city;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getName() {
		return name;
	}


	public void setName(Long name) {
		this.name = name;
	}


	public String getType() {
		return getType();
	}


	public void setType(Long type) {
		this.type = type;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getLandmark() {
		return landmark;
	}


	public void setLandmark(Long landmark) {
		this.landmark = landmark;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

}
