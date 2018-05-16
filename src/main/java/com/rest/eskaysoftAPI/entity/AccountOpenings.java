package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountOpenings")
public class AccountOpenings implements Serializable {
	private static final long serialVersionUID = 2099654952913091298L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String code;
	private String accountName;
	private String town;
	private String openigs;
	private String type;

	public AccountOpenings() {
		super();
	}

	public AccountOpenings(String code, String accountName, String town, String openigs, String type) {
		super();
		this.code = code;
		this.accountName = accountName;
		this.town = town;
		this.openigs = openigs;
		this.type = type;
	}

	public AccountOpenings(Long id, String code, String accountName, String town, String openigs, String type) {
		super();
		Id = id;
		this.code = code;
		this.accountName = accountName;
		this.town = town;
		this.openigs = openigs;
		this.type = type;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getOpenigs() {
		return openigs;
	}

	public void setOpenigs(String openigs) {
		this.openigs = openigs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
