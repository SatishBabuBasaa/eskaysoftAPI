package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manfacturer")
public class Manfacturer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long manfacturerId;
	private String manfacturerName;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public Manfacturer() {
		super();
	}

	public Manfacturer(Long manfacturerId, String manfacturerName, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		this.manfacturerId = manfacturerId;
		this.manfacturerName = manfacturerName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Manfacturer(String manfacturerName, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.manfacturerName = manfacturerName;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the manfacturerId
	 */
	public Long getManfacturerId() {
		return manfacturerId;
	}

	/**
	 * @param manfacturerId
	 *            the manfacturerId to set
	 */
	public void setManfacturerId(Long manfacturerId) {
		this.manfacturerId = manfacturerId;
	}

	/**
	 * @return the manfacturerName
	 */
	public String getManfacturerName() {
		return manfacturerName;
	}

	/**
	 * @param manfacturerName
	 *            the manfacturerName to set
	 */
	public void setManfacturerName(String manfacturerName) {
		this.manfacturerName = manfacturerName;
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
