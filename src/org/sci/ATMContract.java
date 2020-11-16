package org.sci;

public interface ATMContract {

    public void ckeckBalance();
    public void makeDeposit(int amount);
    public void makeWithDrawal(int withdraw);
    public void checkTransactions();
    public void calculateInterest(double interest);
    public void exit();
}
