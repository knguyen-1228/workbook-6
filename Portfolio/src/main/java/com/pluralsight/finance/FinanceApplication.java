package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam","123", 12500);
        Valuable account2 = new BankAccount("Gary","456",1500);

        account1.deposit(100);
        /*account2.deposit(100);
        deposit only works for account one bc Valuable does not have the method deposit
        account 1 has all the methods in bank account
        account 2 only has getValue

        */

    }
}
