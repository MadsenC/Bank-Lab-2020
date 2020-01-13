// TextLab05st.java
// The Deluxe Bank Class
// This is the driving file for the Bank class used in Text Lab 05.
// The only changes you make to this file are removing comments for the 90, 100 and 110 point versions.
// The file Bank.java is where all of the actual work is done.

public class TextLab05st
{
    public static void main (String args[]) {
        System.out.println("\nText Lab 05\n");
        Bank tom = new Bank("Tom Smith");
        Bank sue = new Bank("Sue Brown", 3000, 0);
        Bank bob = new Bank("Bob Jones", 5000, 10000);

        tom.showBalances();
        sue.showBalances();
        bob.showBalances();

        System.out.println("Tom deposits $1000 in checking and $5000 in savings.");
        tom.checkingDeposit(1000);
        tom.savingsDeposit(5000);
        tom.showBalances();

        System.out.println("Bob withdraws $4000 from checking.");
        bob.checkingWithdrawal(4000);
        bob.showBalances();

        System.out.println("Tom withdraws $4000 from checking.");
        tom.checkingWithdrawal(4000);
        tom.showBalances();

        System.out.println("Sue withdraws $4000 from checking.");
        sue.checkingWithdrawal(4000);
        sue.showBalances();

        // Remove the comment symbols below if doing the 90, 100 or 110 point version.

        System.out.println("Bob transfers $5000 from savings to checking.");
        bob.transferToChecking(5000);
        bob.showBalances();

        System.out.println("Sue transfers $2000 from checking to savings.");
        sue.transferToSavings(2000);
        sue.showBalances();


        // Remove the comment symbols below if doing the 100 or 110 point version.

        System.out.println("Tom deposits 75% of a $10,000 paycheck in checking");
        System.out.println("and puts the rest in savings.");
        tom.splitDeposit(10000,75);
        tom.showBalances();


    }
}