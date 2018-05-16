package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;
import com.rest.eskaysoftAPI.entity.States;

public class DistrictDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long districtId;
	private String districtName;
	private States state;

	public DistrictDTO() {

	}

	public States getState() {
		return state;
	}

	public States setStates() {
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

	public DistrictDTO(Long districtId, String districtName, States state) {
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
	}

	public DistrictDTO(String districtName, States state) {
		this.districtName = districtName;
		this.state = state;
	}

}