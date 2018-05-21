package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import java.util.Date;

import com.rest.eskaysoftAPI.entity.States;

public class DistrictDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long districtId;
	private String districtName;
	private States state;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public DistrictDTO() {

	}

	public DistrictDTO(Long districtId, String districtName, States state, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.state = state;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public DistrictDTO(String districtName, States state, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		this.districtName = districtName;
		this.state = state;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy
	 *            the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn
	 *            the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(States state) {
		this.state = state;
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

}