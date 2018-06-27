package com.thinkxfactor.zomatoplus.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_res")
public class Restaurant implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="restaurant_id")
	private Long Id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="description")
	private String description;
	
	@Column(name="website")
	private String website;
	
	@Column(name="like_count")
	private String like_count;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public void setId(Long id) {
		Id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLike_count() {
		return like_count;
	}

	public void setLike_count(String like_count) {
		this.like_count = like_count;
	}
	
}

	
