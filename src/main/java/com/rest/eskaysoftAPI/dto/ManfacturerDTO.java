package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import java.util.Date;

public class ManfacturerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long ManfacturerId;
	private String ManfacturerName;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public ManfacturerDTO() {
		super();
	}

	public ManfacturerDTO(Long manfacturerId, String manfacturerName, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		ManfacturerId = manfacturerId;
		ManfacturerName = manfacturerName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public ManfacturerDTO(String manfacturerName, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		ManfacturerName = manfacturerName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the manfacturerId
	 */
	public Long getManfacturerId() {
		return ManfacturerId;
	}

	/**
	 * @param manfacturerId
	 *            the manfacturerId to set
	 */
	public void setManfacturerId(Long manfacturerId) {
		ManfacturerId = manfacturerId;
	}

	/**
	 * @return the manfacturerName
	 */
	public String getManfacturerName() {
		return ManfacturerName;
	}

	/**
	 * @param manfacturerName
	 *            the manfacturerName to set
	 */
	public void setManfacturerName(String manfacturerName) {
		ManfacturerName = manfacturerName;
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

}
