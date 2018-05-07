package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long stateId;
	private String stateName;
	private Long stateCode;
	private String zone;

	public StateDTO() {

	}

	public StateDTO(String stateName, Long stateCode, String zone) {
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.zone = zone;
	}

	public StateDTO(Long stateId, String stateName, Long stateCode, String zone) {
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.zone = zone;
	}

	public Long getstateId() {
		return stateId;
	}

	public void setstateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getstateName() {
		return stateName;
	}

	public void setstateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getstateCode() {
		return stateCode;
	}

	public void setstateCode(Long stateCode) {
		this.stateCode = stateCode;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}