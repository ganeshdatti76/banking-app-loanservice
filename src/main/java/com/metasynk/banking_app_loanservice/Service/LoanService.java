package com.metasynk.banking_app_loanservice.Service;

import com.metasynk.banking_app_loanservice.model.Loan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoanService {

    List<Loan> getAllLoans();
    Loan getLoan(int loanId);
    String saveLoan(int userId,int accountId,double loanAmount,int loanTenure,double loanOutstanding,double loanAmountPaid,int loanIntrest);
    Loan loanDisbursal(int loanId,int accountId,double loanAmount,int loanTenure,int loanIntrest);

}
