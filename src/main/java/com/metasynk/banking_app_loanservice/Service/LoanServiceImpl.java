package com.metasynk.banking_app_loanservice.Service;

import com.metasynk.banking_app_loanservice.Repository.LoanRepository;
import com.metasynk.banking_app_loanservice.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class LoanServiceImpl implements LoanService {


    @Autowired
    private LoanRepository loanRepository;

    @Override
    public List<Loan> getAllLoans(){
        return loanRepository.findAll();
    }

    @Override
    public Loan getLoan(int loanId){
        Optional<Loan> loan =loanRepository.findById(loanId);
        return loan.orElse(null);
    }


    public String saveLoan(int userId, int accountId, double loanAmount, int loanTenure, double loanOutstanding, double loanAmountPaid, int loanIntrest) {

        Loan loan=new Loan();
        loan.setUserId(userId);
        loan.setAccountid(accountId);
        loan.setLoanAmount(loanAmount);
        loan.setLoanTenure(loanTenure);
        loan.setLoanAmountOutstanding(loanOutstanding);
        loan.setLoanAmountPaid(loanAmountPaid);
        loan.setLoanIntrest(loanIntrest);
        loanRepository.save(loan);
        String response="loan saves successfully";
        return response;
    }

    public Loan loanDisbursal(int loanId,int accountId,double loanAmount,int loanTenure,int loanIntrest){
        Loan loan=new Loan();
        loan.setLoanId(loanId);
        loan.setAccountid(accountId);
        loan.setLoanAmount(loanAmount);
        loan.setLoanTenure(loanTenure);
        loan.setLoanIntrest(loanIntrest);
        loanRepository.save(loan);
        return loan;

    }


}
