package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import java.util.Date;

public class ProductCategoryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long ProductCategoryId;
	private String ProductCategoryName;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public ProductCategoryDTO() {
		super();
	}

	
	public ProductCategoryDTO(Long productCategoryId, String productCategoryName, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		ProductCategoryId = productCategoryId;
		ProductCategoryName = productCategoryName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	
	public ProductCategoryDTO(String productCategoryName, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		ProductCategoryName = productCategoryName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	/**
	 * @return the productCategoryId
	 */
	public Long getProductCategoryId() {
		return ProductCategoryId;
	}

	/**
	 * @param productCategoryId
	 *            the productCategoryId to set
	 */
	public void setProductCategoryId(Long productCategoryId) {
		ProductCategoryId = productCategoryId;
	}

	/**
	 * @return the productCategoryName
	 */
	public String getProductCategoryName() {
		return ProductCategoryName;
	}

	/**
	 * @param productCategoryName
	 *            the productCategoryName to set
	 */
	public void setProductCategoryName(String productCategoryName) {
		ProductCategoryName = productCategoryName;
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