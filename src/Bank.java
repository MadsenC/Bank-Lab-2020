// Bank.java
// This is the student, starting version of the <Bank> class used with Text Lab 05.

import java.text.DecimalFormat;

public class Bank
{
    private double checkingBal;	private double savingsBal;
    private String name;

    public Bank(String n) {
        name = n;
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n, double c, double s) {
        name = n;
        checkingBal = c;
        savingsBal  = s;
    }

    public double getChecking() {
        return checkingBal;
    }

    public double getSavings() {
        return savingsBal;
    }

    public double getCombined() {
        return checkingBal + savingsBal;
    }

    public void checkingDeposit(double amount) {
        checkingBal += amount;
    }

    public void savingsDeposit(double amount) {
        savingsBal += amount;
    }

    public void closeChecking() {
        checkingBal = 0;
    }

    public void closeSavings() {
        savingsBal = 0;
    }

    public void checkingWithdrawal(double amount) {
        if (amount <= checkingBal) {
            checkingBal -= amount;
        } else if (amount <= checkingBal + savingsBal) {
            double Temp = amount - checkingBal;
            checkingBal = 0.0;
            savingsBal = savingsBal - Temp;
            System.out.println("\nOverdraft Protection: $" + Temp + " transferred from Savings to Checking.\n");
        } else {
            System.out.println("Insufficient Funds!  Transaction Refused!\n");
        }
    }

    public void savingsWithdrawal(double amount) {
        if (amount >= savingsBal)
            System.out.println("Insufficient Funds!  Transaction Refused!\n");
        else
            savingsBal -= amount;
    }

    public void transferToChecking(double amount) {
        if (amount >= savingsBal) {
            System.out.println("Insufficient Funds!  Transaction Refused!\n");
        }
        else {
            savingsBal -= amount;
            checkingBal += amount;
        }
    }

    public void transferToSavings(double amount) {
        if (amount >= checkingBal) {
            System.out.println("Insufficient Funds!  Transaction Refused!\n");
        }
        else {
            savingsBal += amount;
            checkingBal -= amount;
        }
    }

    public void splitDeposit(double amount, double percent) {
        checkingBal += amount * (percent * 0.01);
        double Temp = 100 - percent;
        savingsBal += amount * (Temp * 0.01);
    }

    public void showBalances() {
        System.out.println();
        System.out.println("Account balances for " + name);
        System.out.println("Checking: $" + getChecking());
        System.out.println("Savings:  $" + getSavings());
        System.out.println("Combined: $" + getCombined());
        System.out.println();
    }
}