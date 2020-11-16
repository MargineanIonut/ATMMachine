package org.sci;

public class Main {

    public static void main(String[] args) {
        ATMFunctions atm = new ATMFunctions();


        atm.makeDeposit(200);
        atm.makeDeposit(2300);
        atm.makeWithDrawal(200);
        atm.makeWithDrawal(200);
        atm.makeDeposit(100);
        atm.makeDeposit(2000);
        atm.makeWithDrawal(400);
        atm.makeDeposit(2000);
        atm.makeWithDrawal(200);
        atm.makeWithDrawal(600);

        atm.ckeckBalance();
        atm.checkTransactions();
        atm.calculateInterest(2);
        atm.exit();




    }
}
