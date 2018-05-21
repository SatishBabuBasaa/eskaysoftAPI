package com.rest.eskaysoftAPI.entity;

import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ProductId;
	private String ProductCode;
	private String ProductName;
	private String Packing;
	private Long BoxQty;
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductGroup group;
	private Long CaseQty;
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductCategory category;
	private Long NetRate;
	private String IsNetRateItem;
	private Long SchemeQty;
	private String Free;
	private float Tax;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	

	public Product(Long productId, String productCode, String productName, String packing, Long boxQty,
			ProductGroup group, Long caseQty, ProductCategory category, Long netRate, String isNetRateItem,
			Long schemeQty, String free, float tax, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		ProductId = productId;
		ProductCode = productCode;
		ProductName = productName;
		Packing = packing;
		BoxQty = boxQty;
		this.group = group;
		CaseQty = caseQty;
		this.category = category;
		NetRate = netRate;
		IsNetRateItem = isNetRateItem;
		SchemeQty = schemeQty;
		Free = free;
		Tax = tax;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	
	public Product(String productCode, String productName, String packing, Long boxQty, ProductGroup group,
			Long caseQty, ProductCategory category, Long netRate, String isNetRateItem, Long schemeQty, String free,
			float tax, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		Packing = packing;
		BoxQty = boxQty;
		this.group = group;
		CaseQty = caseQty;
		this.category = category;
		NetRate = netRate;
		IsNetRateItem = isNetRateItem;
		SchemeQty = schemeQty;
		Free = free;
		Tax = tax;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return ProductId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Long productId) {
		ProductId = productId;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return ProductCode;
	}

	/**
	 * @param productCode
	 *            the productCode to set
	 */
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return ProductName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		ProductName = productName;
	}

	/**
	 * @return the packing
	 */
	public String getPacking() {
		return Packing;
	}

	/**
	 * @param packing
	 *            the packing to set
	 */
	public void setPacking(String packing) {
		Packing = packing;
	}

	/**
	 * @return the boxQty
	 */
	public Long getBoxQty() {
		return BoxQty;
	}

	/**
	 * @param boxQty
	 *            the boxQty to set
	 */
	public void setBoxQty(Long boxQty) {
		BoxQty = boxQty;
	}

	/**
	 * @return the group
	 */
	public ProductGroup getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(ProductGroup group) {
		this.group = group;
	}

	/**
	 * @return the caseQty
	 */
	public Long getCaseQty() {
		return CaseQty;
	}

	/**
	 * @param caseQty
	 *            the caseQty to set
	 */
	public void setCaseQty(Long caseQty) {
		CaseQty = caseQty;
	}

	/**
	 * @return the category
	 */
	public ProductCategory getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	/**
	 * @return the netRate
	 */
	public Long getNetRate() {
		return NetRate;
	}

	/**
	 * @param netRate
	 *            the netRate to set
	 */
	public void setNetRate(Long netRate) {
		NetRate = netRate;
	}

	/**
	 * @return the isNetRateItem
	 */
	public String getIsNetRateItem() {
		return IsNetRateItem;
	}

	/**
	 * @param isNetRateItem
	 *            the isNetRateItem to set
	 */
	public void setIsNetRateItem(String isNetRateItem) {
		IsNetRateItem = isNetRateItem;
	}

	/**
	 * @return the schemeQty
	 */
	public Long getSchemeQty() {
		return SchemeQty;
	}

	/**
	 * @param schemeQty
	 *            the schemeQty to set
	 */
	public void setSchemeQty(Long schemeQty) {
		SchemeQty = schemeQty;
	}

	/**
	 * @return the free
	 */
	public String getFree() {
		return Free;
	}

	/**
	 * @param free
	 *            the free to set
	 */
	public void setFree(String free) {
		Free = free;
	}

	/**
	 * @return the tax
	 */
	public float getTax() {
		return Tax;
	}

	/**
	 * @param tax
	 *            the tax to set
	 */
	public void setTax(float tax) {
		Tax = tax;
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
