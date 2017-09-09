package module2.hw2;


import java.util.Scanner;

/**
 *
 * Continue with BANK example
 * 2.1 Write method which withdraws money from account and takes commision 5% of the transaction.
 * Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.
 *
 * Example
 *
 * Input
 *
 * balance = 100
 * withdrawal = 10
 *
 * Output
 * OK 0.5 89.5
 *
 * Input
 *
 * balance = 100
 * withdrawal = 99
 *
 * Output
 * NO
 *
 */

public class BankLogicWithdraw {

    public static String calculateOperation(double amount) {

        double balance = 100;
        double commission = amount * 0.05;
        String endOfOperation = "End of operation";

        if (amount + commission <= balance) {
            balance = balance - amount - commission;
            System.out.println("OK " + "Your balance now: " + balance
                    + " Commission: " + commission);
        } else {
            System.out.println("No! Operation is impossible");
        }
        return endOfOperation;

    }

    public static void main(String[] args) {

        double balance = 100;

        System.out.println("Your balance is: " + balance + "$" +
                "\nEnter the sum amount wish to get");

        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();

        System.out.println(calculateOperation(amount));

    }
}
