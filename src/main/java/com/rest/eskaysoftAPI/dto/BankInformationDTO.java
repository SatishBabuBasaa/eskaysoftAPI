package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class BankInformationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long BankId;
	private String Name;
	private String  Address;
	public BankInformationDTO() {
		super();
	}
	public BankInformationDTO(Long bankId, String name, String address) {
		super();
		BankId = bankId;
		Name = name;
		Address = address;
	}
	public BankInformationDTO(String name, String address) {
		super();
		Name = name;
		Address = address;
	}
	/**
	 * @return the bankId
	 */
	public Long getBankId() {
		return BankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Long bankId) {
		BankId = bankId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	
}