package com.rest.eskaysoftAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "businessExecutives")
public class BusinessExecutives {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	String name;
	String address;
	String town;
	Long mobile;

	public BusinessExecutives() {
	}

	public BusinessExecutives(Long id, String name, String address, String town, Long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.town = town;
		this.mobile = mobile;
	}

	public BusinessExecutives(String name, String address, String town, Long mobile) {
		super();
		this.name = name;
		this.address = address;
		this.town = town;
		this.mobile = mobile;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
