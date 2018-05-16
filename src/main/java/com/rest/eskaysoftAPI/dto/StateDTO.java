package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String stateName;
	private Long stateCode;
	private String zone;

	public StateDTO() {

	}

	public StateDTO(Long id, String stateName, Long stateCode, String zone) {
		super();
		Id = id;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.zone = zone;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Long getStateCode() {
		return stateCode;
	}

	public void setStateCode(Long stateCode) {
		this.stateCode = stateCode;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public StateDTO(String stateName, Long stateCode, String zone) {
		super();
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.zone = zone;
	}

}