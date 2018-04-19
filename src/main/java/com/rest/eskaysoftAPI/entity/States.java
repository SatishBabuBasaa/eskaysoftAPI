package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class States implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stateId;
	private String stateName;
	private int stateCode;
	private String zone;

	public Long getstateId() {
		return stateId;
	}

	/**
	 * @return the stateId
	 */
	public Long getStateId() {
		return stateId;
	}

	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateCode
	 */
	public int getStateCode() {
		return stateCode;
	}

	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	
	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * @param zone the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getstateName() {
		return stateName;
	}

	public void setstateName(String stateName) {
		this.stateName = stateName;
	}

	public int getstateCode() {
		return stateCode;
	}

	public void setstateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public String getzone() {
		return zone;
	}

	public void setScheduleType(String zone) {
		this.zone = zone;
	}
}
