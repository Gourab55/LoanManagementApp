package com.Loan.LoanService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Loan.Exception.ResourceNotFoundException;
import com.Loan.Model.Loan;


@Service
public class LoanService {
	
	@Autowired
	ILoanRepo iloanRepo;
	
	
	public Loan createLoan(Loan loan) {
		return iloanRepo.save(loan);
		
	}
	
	public List<Loan> getAllLoans(){
		
		return iloanRepo.findAll();
	}
	
	
	
	public Loan GetLoan(Integer id) {
		
		Loan ExistingLoan=iloanRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Loan","id",id));
		return ExistingLoan;
	}
	
	public Loan UpdateLoan(Loan loan, Integer id) {
		// we will check a book is exist or not 
		
		Loan ExistingLoan=iloanRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Loan","id",id));
		
		
		ExistingLoan.setFirstname(loan.getFirstname());
	   
		ExistingLoan.setLastname(loan.getLastname());
	
	ExistingLoan.setLoanno(loan.getLoanno());
	ExistingLoan.setProperty_add(loan.getProperty_add());
	ExistingLoan.setLoan_amount(loan.getLoan_amount());
	ExistingLoan.setLoan_type(loan.getLoan_type());
	ExistingLoan.setLoan_term(loan.getLoan_term());
	
	
	Loan updateLoan=iloanRepo.save(ExistingLoan);
	
	return updateLoan;
	
	}
	
	public List<Loan> getLoansBySearch(String firstname, String lastname, Integer loanno) {
	 
		
//		List<LoanData> allLoans= iloanRepo.findAll();
		
//		if(fastname!=null && lastname!= null  && loanNo!= null) {
//			allLoans=allLoans.stream()
//					.filter(bo -> bo.getFastname().equals(fastname))
//					.filter(bo -> bo.getLastname().equals(lastname))
//					.filter(bo -> bo.getLoanno() <= loanNo)
//					.collect(Collectors.toList());
//		}
//		System.out.println("Search Results"+ allLoans);
//		return allLoans;
		System.out.println("outside fast name"+firstname);
//		
		if(firstname !=null && !firstname.isEmpty() )
		{
			System.out.println("inside fast name"+firstname);
			List<Loan> loan=iloanRepo.findByFirstname(firstname);
			loan.forEach(e-> {
				System.out.println(e);
			});
			
			return loan;
			
		}
	 if(lastname !=null && !lastname.isEmpty())
		{
			System.out.println("inside last name"+lastname);
		  List<Loan> loan=iloanRepo.findByLastname(lastname);
			return loan;
			}
	 
	   if(loanno !=null && loanno>0)
		{
			List<Loan> loan=iloanRepo.findByLoanno(loanno);                 
			return loan;
		}
		return null;
//		
		
	}
	public void deleteBook(Integer id) {
		iloanRepo.deleteById(id);
		
	}


}
