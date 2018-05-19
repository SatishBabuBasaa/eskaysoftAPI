package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountInformation")
public class AccountInformation implements Serializable {
	private static final long serialVersionUID = 2099654952913091298L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String accountName;
	String subSchedule;
	String schedule;
	String address1;
	String address2;
	String town;
	String pinDistrict;
	String state;
	String areaName;
	Long phone;
	Long mobile;
	String email;
	String shortName;
	Long licNo1;
	Long licNo2;
	Long licExpiry;
	Long retLicNo1;
	Long retLicNo2;
	Long retExpiry;
	Long foodLicNo;
	String otherLicense;
	String otherLicenseExpiry;
	String gstType;
	String gstIN;
	String natureOfGST;
	Long uinNo;
	String saleType;
	String customerType;
	String creditLimit;
	Long dueDays;
	String contactPerson;
	String hsnCode;
	String sacCode;
	String rateOfTax;
	String openingBalance;
	String openingType;
	String specialRAemarks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getSubSchedule() {
		return subSchedule;
	}

	public void setSubSchedule(String subSchedule) {
		this.subSchedule = subSchedule;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPinDistrict() {
		return pinDistrict;
	}

	public void setPinDistrict(String pinDistrict) {
		this.pinDistrict = pinDistrict;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Long getLicNo1() {
		return licNo1;
	}

	public void setLicNo1(Long licNo1) {
		this.licNo1 = licNo1;
	}

	public Long getLicNo2() {
		return licNo2;
	}

	public void setLicNo2(Long licNo2) {
		this.licNo2 = licNo2;
	}

	public Long getLicExpiry() {
		return licExpiry;
	}

	public void setLicExpiry(Long licExpiry) {
		this.licExpiry = licExpiry;
	}

	public Long getRetLicNo1() {
		return retLicNo1;
	}

	public void setRetLicNo1(Long retLicNo1) {
		this.retLicNo1 = retLicNo1;
	}

	public Long getRetLicNo2() {
		return retLicNo2;
	}

	public void setRetLicNo2(Long retLicNo2) {
		this.retLicNo2 = retLicNo2;
	}

	public Long getRetExpiry() {
		return retExpiry;
	}

	public void setRetExpiry(Long retExpiry) {
		this.retExpiry = retExpiry;
	}

	public Long getFoodLicNo() {
		return foodLicNo;
	}

	public void setFoodLicNo(Long foodLicNo) {
		this.foodLicNo = foodLicNo;
	}

	public String getOtherLicense() {
		return otherLicense;
	}

	public void setOtherLicense(String otherLicense) {
		this.otherLicense = otherLicense;
	}

	public String getOtherLicenseExpiry() {
		return otherLicenseExpiry;
	}

	public void setOtherLicenseExpiry(String otherLicenseExpiry) {
		this.otherLicenseExpiry = otherLicenseExpiry;
	}

	public String getGstType() {
		return gstType;
	}

	public void setGstType(String gstType) {
		this.gstType = gstType;
	}

	public String getGstIN() {
		return gstIN;
	}

	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}

	public String getNatureOfGST() {
		return natureOfGST;
	}

	public void setNatureOfGST(String natureOfGST) {
		this.natureOfGST = natureOfGST;
	}

	public Long getUinNo() {
		return uinNo;
	}

	public void setUinNo(Long uinNo) {
		this.uinNo = uinNo;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Long getDueDays() {
		return dueDays;
	}

	public void setDueDays(Long dueDays) {
		this.dueDays = dueDays;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getSacCode() {
		return sacCode;
	}

	public void setSacCode(String sacCode) {
		this.sacCode = sacCode;
	}

	public String getRateOfTax() {
		return rateOfTax;
	}

	public void setRateOfTax(String rateOfTax) {
		this.rateOfTax = rateOfTax;
	}

	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getOpeningType() {
		return openingType;
	}

	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}

	public String getSpecialRAemarks() {
		return specialRAemarks;
	}

	public void setSpecialRAemarks(String specialRAemarks) {
		this.specialRAemarks = specialRAemarks;
	}

	public AccountInformation(Long id, String accountName, String subSchedule, String schedule, String address1,
			String address2, String town, String pinDistrict, String state, String areaName, Long phone, Long mobile,
			String email, String shortName, Long licNo1, Long licNo2, Long licExpiry, Long retLicNo1, Long retLicNo2,
			Long retExpiry, Long foodLicNo, String otherLicense, String otherLicenseExpiry, String gstType,
			String gstIN, String natureOfGST, Long uinNo, String saleType, String customerType, String creditLimit,
			Long dueDays, String contactPerson, String hsnCode, String sacCode, String rateOfTax, String openingBalance,
			String openingType, String specialRAemarks) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.subSchedule = subSchedule;
		this.schedule = schedule;
		this.address1 = address1;
		this.address2 = address2;
		this.town = town;
		this.pinDistrict = pinDistrict;
		this.state = state;
		this.areaName = areaName;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
		this.shortName = shortName;
		this.licNo1 = licNo1;
		this.licNo2 = licNo2;
		this.licExpiry = licExpiry;
		this.retLicNo1 = retLicNo1;
		this.retLicNo2 = retLicNo2;
		this.retExpiry = retExpiry;
		this.foodLicNo = foodLicNo;
		this.otherLicense = otherLicense;
		this.otherLicenseExpiry = otherLicenseExpiry;
		this.gstType = gstType;
		this.gstIN = gstIN;
		this.natureOfGST = natureOfGST;
		this.uinNo = uinNo;
		this.saleType = saleType;
		this.customerType = customerType;
		this.creditLimit = creditLimit;
		this.dueDays = dueDays;
		this.contactPerson = contactPerson;
		this.hsnCode = hsnCode;
		this.sacCode = sacCode;
		this.rateOfTax = rateOfTax;
		this.openingBalance = openingBalance;
		this.openingType = openingType;
		this.specialRAemarks = specialRAemarks;
	}

}