package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class BusinessExecutiveDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	Long id;
	String name;
	String address;
	String town;
	Long mobile;

	public BusinessExecutiveDTO() {
		super();
	}

	public BusinessExecutiveDTO(Long id, String address, String name, String town, Long mobile) {
		this.id = id;
		this.address = address;
		this.name = name;
		this.town = town;
		this.mobile = mobile;
	}

	public BusinessExecutiveDTO(String name, String address, String town, Long mobile) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
