package com.Loan.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanData {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;

	private String fastname;
	private String lastname;
	private Integer loanNo;
	private String property_add;
	private Double loan_amount;
	private String loan_type;
	private Integer loan_term;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFastname() {
		return fastname;
	}
	public void setFastname(String fastname) {
		this.fastname = fastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
	}
	public String getProperty_add() {
		return property_add;
	}
	public void setProperty_add(String property_add) {
		this.property_add = property_add;
	}
	public Double getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(Double loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public Integer getLoan_term() {
		return loan_term;
	}
	public void setLoan_term(Integer loan_term) {
		this.loan_term = loan_term;
	}
	public LoanData(Integer id, String fastname, String lastname, Integer loanNo, String property_add,
			Double loan_amount, String loan_type, Integer loan_term) {
		super();
		this.id = id;
		this.fastname = fastname;
		this.lastname = lastname;
		this.loanNo = loanNo;
		this.property_add = property_add;
		this.loan_amount = loan_amount;
		this.loan_type = loan_type;
		this.loan_term = loan_term;
	}
	public LoanData() {
		super();
	}
	
	
	
	
	
	
	
	
	
	

}
