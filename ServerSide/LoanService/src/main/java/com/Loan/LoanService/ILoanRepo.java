package com.Loan.LoanService;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Loan.Model.Loan;

@Repository
public interface ILoanRepo  extends JpaRepository<Loan, Integer>{
	
	List<Loan> findByFirstname(String firstname);
	
//	@Query( "SELECT u from Loan u WHERE u.firstname=:n")
//	List<Loan> getUserByfirstname(@Param("n") String firstname);

	List<Loan> findByLastname(String lastname);
	
//	@Query( "SELECT u from Loan u WHERE u.lastname=:p")
//	List<Loan> getUserBylastname(@Param("p") String lastname);
	
	List<Loan> findByLoanno(Integer loanno);

//	@Query( "SELECT u from Loan u WHERE u.loanno=:n")
//	List<Loan> getUserByloanno(@Param("n") Integer loanno);


}
