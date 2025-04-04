package com.metasynk.banking_app_loanservice.Repository;

import com.metasynk.banking_app_loanservice.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Integer> {

}
