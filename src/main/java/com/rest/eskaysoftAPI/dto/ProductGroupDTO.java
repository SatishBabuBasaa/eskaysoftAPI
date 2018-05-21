package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import java.util.Date;

public class ProductGroupDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long ProductGroupId;
	private String ProductGroupName;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public ProductGroupDTO() {
		super();
	}

	
	public ProductGroupDTO(Long productGroupId, String productGroupName, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		ProductGroupId = productGroupId;
		ProductGroupName = productGroupName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	
	public ProductGroupDTO(String productGroupName, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		ProductGroupName = productGroupName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	/**
	 * @return the productGroupId
	 */
	public Long getProductGroupId() {
		return ProductGroupId;
	}

	/**
	 * @param productGroupId
	 *            the productGroupId to set
	 */
	public void setProductGroupId(Long productGroupId) {
		ProductGroupId = productGroupId;
	}

	/**
	 * @return the productGroupName
	 */
	public String getProductGroupName() {
		return ProductGroupName;
	}

	/**
	 * @param productGroupName
	 *            the productGroupName to set
	 */
	public void setProductGroupName(String productGroupName) {
		ProductGroupName = productGroupName;
	}


	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}


	/**
	 * @param createdBy the createdBy to set
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
	 * @param createdOn the createdOn to set
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
	 * @param updatedBy the updatedBy to set
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
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	

}