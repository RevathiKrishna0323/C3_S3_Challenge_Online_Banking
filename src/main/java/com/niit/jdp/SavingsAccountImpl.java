/*
 * Author Name: Revathi
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        // object declaration and initialization
        SavingsAccount savingsAccount = new SavingsAccount();
        // calling methods
        System.out.println(savingsAccount.DebitCash(1700.0));
        System.out.println(savingsAccount.CreditCash(3000.0));
        System.out.println(savingsAccount.RetrieveCash(563.0));
    }
}
