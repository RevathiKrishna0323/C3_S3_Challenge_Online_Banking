/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public class SavingsAccount {
    //some attributes that can be modelled in SavingsAccount class are
    private String accountName;
    private String accountNumber;
    private String accountOpeningDate;
    private String status;
    private double availableBalance;
    private String totalBalance;
    private Boolean isInternetBankingEnabled;
    private Boolean isMobileBankingEnabled;
    private double interestRate;
    private String modeOfOperation;

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public String getStatus() {
        return status;
    }

    public String getAvailableBalance() {
        return availableBalance;
    }

    public String getTotalBalance() {
        return totalBalance;
    }

    public Boolean getInternetBankingEnabled() {
        return isInternetBankingEnabled;
    }

    public Boolean getMobileBankingEnabled() {
        return isMobileBankingEnabled;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setInternetBankingEnabled(Boolean internetBankingEnabled) {
        isInternetBankingEnabled = internetBankingEnabled;
    }

    public void setMobileBankingEnabled(Boolean mobileBankingEnabled) {
        isMobileBankingEnabled = mobileBankingEnabled;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    public SavingsAccount() {

    }

    public double DebitCash(double cash){
        return cash = this.availableBalance - cash;
    }
    public double CreditCash(double cash){
        return cash = this.availableBalance + cash;
    }
    public double RetrieveCash(double cash){
        return cash;
    }
}


