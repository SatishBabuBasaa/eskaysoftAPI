package com.rest.eskaysoftAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class Districts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long districtId;
	private String districtName;
	private States state;

	public Districts() {
	}

	public Districts(Long districtId, String districtName, States state) {
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
	}

	public Districts(String districtName, States state) {
		this.districtName = districtName;
		this.state = state;
	}

	/**
	 * @return the state
	 */
	public States getState() {
		return state;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public States setStateName(States state) {
		return state = state;
	}
}
