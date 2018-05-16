package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class CustomerWiseDiscountsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	public CustomerWiseDiscountsDTO(String customer, String companyOption, String discount, String companyDiscription,
			String disc) {
		super();
		this.customer = customer;
		this.companyOption = companyOption;
		this.discount = discount;
		this.companyDiscription = companyDiscription;
		this.disc = disc;
	}

	public CustomerWiseDiscountsDTO() {
		super();
	}

	public CustomerWiseDiscountsDTO(Long id, String customer, String companyOption, String discount,
			String companyDiscription, String disc) {
		super();
		this.id = id;
		this.customer = customer;
		this.companyOption = companyOption;
		this.discount = discount;
		this.companyDiscription = companyDiscription;
		this.disc = disc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCompanyOption() {
		return companyOption;
	}

	public void setCompanyOption(String companyOption) {
		this.companyOption = companyOption;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCompanyDiscription() {
		return companyDiscription;
	}

	public void setCompanyDiscription(String companyDiscription) {
		this.companyDiscription = companyDiscription;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	/*
	 * public String getcDisc() { return cDisc; }
	 * 
	 * public void setcDisc(String cDisc) { this.cDisc = cDisc; }
	 */

	private String customer;
	private String companyOption;
	private String discount;
	private String companyDiscription;
	private String disc;
	// private String cDisc;

}
