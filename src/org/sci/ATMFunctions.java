package org.sci;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ATMFunctions implements ATMContract {

    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateObj.format(myFormatObj);





    int balance, balance2;
    int dif,dif2;
    List a = new ArrayList();
    List transactions = new ArrayList();

    @Override
    public void ckeckBalance() {

        System.out.println("The current ballance is:" +balance);
    }


    @Override
    public void makeDeposit(int amount) {
        balance = balance + amount;
        transactions.add(balance);

    }

    @Override
    public void makeWithDrawal(int withdraw) {
        balance  = balance - withdraw;
        transactions.add(balance);

    }

    @Override
    public void checkTransactions() {
        System.out.println("History of your transactions: ");
        a.add(0,0);
        for (int i = 0; i < transactions.size(); i++) {
            a.add(transactions.get(i));

        }

        for (int i = 0; i < transactions.size(); i++) {
            if (((int)transactions.get(i)) > ((int)a.get(i))){
                System.out.println("You deposited: " + ((int)transactions.get(i) - (int)a.get(i))+ " $" + " on " + formattedDate);
                System.out.println("");
            }else if (((int)transactions.get(i)) < ((int)a.get(i))) {
                System.out.println("You withdrew: " + ((int)a.get(i) - (int)transactions.get(i)) + " $" +  " on " + formattedDate);
                System.out.println("");
            }
        }

    }





    @Override
    public void calculateInterest(double interest) {
        interest = interest/100;
        Double Calculate = balance * (interest);
        System.out.println("At the end of this year you will have +" +(balance + Calculate) + " $ in your bank account");
    }

    @Override
    public void exit() {
        System.out.println("Thank you for using our bank");
        System.exit(0);

    }
}
