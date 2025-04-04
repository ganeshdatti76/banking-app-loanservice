package com.metasynk.banking_app_loanservice.Controller;

import com.metasynk.banking_app_loanservice.Service.LoanServiceImpl;
import com.metasynk.banking_app_loanservice.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanServiceImpl loanService;

    @GetMapping("/getAllLoans")
    public ResponseEntity<List<Loan>> getLoans(){
        List<Loan> users=  loanService.getAllLoans();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getLoan")
    public Loan getUser(int loanId){
        Loan loan=loanService.getLoan(loanId);
        return loan;
    }

    @PostMapping("/postLoan")
    public String saveLoan(@RequestParam("userId")int userId, @RequestParam("accountId")int accountId, @RequestParam("loanAmount")double loanAmount, @RequestParam("loanTenure")int loanTenure, @RequestParam("loanOutstanding")double loanOutstanding, @RequestParam("loanAmountPaid")double loanAmountPaid,@RequestParam("loanIntrest")int loanIntrest){
        return loanService.saveLoan(userId,accountId,loanAmount,loanTenure,loanOutstanding,loanAmountPaid,loanIntrest);
    }

    @PostMapping("/disLaon")
    public Loan loanDisbursal(@RequestParam("loanId") int loanId,@RequestParam("accountId")int accountId,@RequestParam("loanAmount")double loanAmount,@RequestParam("loanTenure")int loanTenure,@RequestParam("loanIntrest")int loanIntrest){
        return loanService.loanDisbursal(loanId,accountId,loanAmount,loanTenure,loanIntrest);
    }




}
