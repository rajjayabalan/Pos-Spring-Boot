package com.jk.form.customer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers", uniqueConstraints = { @UniqueConstraint(columnNames = "mobileno"),
		@UniqueConstraint(columnNames = "emailid") })
public class Customer implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = -3781580271832206298L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 40)
	private String firstname;

	@Size(max = 40)
	private String middlename;

	@Size(max = 40)
	private String lastname;

	@NotBlank
	@Size(max = 10)
	private String companycode;

	@NotBlank
	@Size(max = 4)
	private String mobilecode;

	@NotBlank
	@Size(max = 10)
	private String mobileno;

	@NotBlank
	@Size(max = 50)
	@Email
	private String emailid;

	@NotBlank
	private Date cr_dt;

	@NotBlank
	@Size(max = 16)
	private String cr_id;

	private Date up_dt;

	@Size(max = 16)
	private String up_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompanycode() {
		return companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getMobilecode() {
		return mobilecode;
	}

	public void setMobilecode(String mobilecode) {
		this.mobilecode = mobilecode;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Date getCr_dt() {
		return cr_dt;
	}

	public void setCr_dt(Date cr_dt) {
		this.cr_dt = cr_dt;
	}

	public String getCr_id() {
		return cr_id;
	}

	public void setCr_id(String cr_id) {
		this.cr_id = cr_id;
	}

	public Date getUp_dt() {
		return up_dt;
	}

	public void setUp_dt(Date up_dt) {
		this.up_dt = up_dt;
	}

	public String getUp_id() {
		return up_id;
	}

	public void setUp_id(String up_id) {
		this.up_id = up_id;
	}

}
