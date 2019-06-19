package com.hcl.ingbanking.dto;

import java.sql.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class AccountDto {
	private Long accountId;
	private String accountHolderName;
	private String address;
	private String city;
	private String email;
	private Long mobileNumber;
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private double balance;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountDto [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", address="
				+ address + ", city=" + city + ", email=" + email + ", mobileNumber=" + mobileNumber + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy + ", modifiedBy="
				+ modifiedBy + ", balance=" + balance + "]";
	}
	
	
}
