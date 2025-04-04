package com.metasynk.banking_app_loanservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Table
@Entity
@Builder
@Data
public class Loan {

    @Id
    private int loanId;
    private int userId;
    private int accountid;
    private double loanAmount;
    private int loanTenure;
    private double loanAmountOutstanding;
    private double loanAmountPaid;
    private int loanIntrest;

    public Loan() {
    }

    public Loan(int loanId, int userId, int accountid, double loanAmount, int loanTenure, double loanAmountOutstanding, double loanAmountPaid, int loanIntrest) {
        this.loanId = loanId;
        this.userId = userId;
        this.accountid = accountid;
        this.loanAmount = loanAmount;
        this.loanTenure = loanTenure;
        this.loanAmountOutstanding = loanAmountOutstanding;
        this.loanAmountPaid = loanAmountPaid;
        this.loanIntrest = loanIntrest;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
    }

    public double getLoanAmountOutstanding() {
        return loanAmountOutstanding;
    }

    public void setLoanAmountOutstanding(double loanAmountOutstanding) {
        this.loanAmountOutstanding = loanAmountOutstanding;
    }

    public double getLoanAmountPaid() {
        return loanAmountPaid;
    }

    public void setLoanAmountPaid(double loanAmountPaid) {
        this.loanAmountPaid = loanAmountPaid;
    }

    public int getLoanIntrest() {
        return loanIntrest;
    }

    public void setLoanIntrest(int loanIntrest) {
        this.loanIntrest = loanIntrest;
    }
}
