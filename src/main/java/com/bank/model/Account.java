package com.bank.model;

public class Account {
    private int accountId;
    private String accountNumber;
    private String accountType;
    private Double balance = 0.00;
    private Double interestRate;
    private String status;
    private int userId;

    public Account() {
    }

    public Account(int accountId, int userId, String accountNumber, String accountType, Double balance, Double interestRate, String status) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.interestRate = interestRate;
        this.status = status;
    }


    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountId() {// don't delete it, it's using somewhere
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountType() {
        return accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public String getStatus() {
        return status;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

}