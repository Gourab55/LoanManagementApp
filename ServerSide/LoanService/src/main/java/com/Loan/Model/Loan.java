package com.Loan.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;

	private String firstname;

	private String lastname;
	private Integer loanno;
	
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Integer getLoanno() {
		return loanno;
	}
	public void setLoanno(Integer loanno) {
		this.loanno = loanno;
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
	public Loan(Integer id, String firstname, String lastname, Integer loanno, String property_add,
			Double loan_amount, String loan_type, Integer loan_term) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.loanno = loanno;
		this.property_add = property_add;
		this.loan_amount = loan_amount;
		this.loan_type = loan_type;
		this.loan_term = loan_term;
	}
	public Loan() {
		super();
	}
	

}
