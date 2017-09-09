package module2.hw3;

import java.util.Scanner;
import java.lang.String;

/**
 * You need to write method which withdraw money of particular account owner if
 * he/she can. Print name + NO of withdrawal fs not possible and
 * name + sum of withdrawal + balance after withdrawal in other case.
 * Commision is 5% for all cases.
 * <p>
 * Example
 * <p>
 * Input
 * <p>
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 * <p>
 * String ownerName = Ann
 * double withdrawal = 100;
 * <p>
 * Output
 * Ann 100 145
 * <p>
 * Input
 * <p>
 * int[] balances = {1200, 250, 2000, 500, 3200};
 * String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
 * <p>
 * String ownerName = Oww
 * double withdrawal = 490;
 * <p>
 * Output
 * Oww NO
 */

public class WithdrawMoneyOfParticularAccount {

    public static void main(String[] args) {

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 250, 2000, 500, 3200};
        boolean check;
        String inName;

        do {
            inName = enterName();
            check = searchName(inName, ownerNames);

        } while (!check);

        double balance = assignedBalances(inName, balances, ownerNames);
        double amount = enterAmount(balance);

        System.out.println(calculateOperation(balance, amount));

    }

    private static String enterName() {

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your Name: ");

        return name.next();

    }

    private static boolean searchName(String inName, String ownerNames[]) {

        /*
        *   Validation
        * */
        boolean[] checkName = new boolean[1];

        if (ownerNames == null || ownerNames.length == 0) {
            return checkName[0] = false;
        }

        for (String name : ownerNames) {
            if (inName.equalsIgnoreCase(name)) {
                System.out.println("Hello " + inName);
                checkName[0] = true;
            }
        }
        return checkName[0];
    }

    private static double assignedBalances(String inName, int[] balances, String ownerNames[]) {
        double balance[] = new double[1];
        if (inName.equalsIgnoreCase(ownerNames[0])) {
            balance[0] = balances[0];
        } else if (inName.equalsIgnoreCase(ownerNames[1])) {
            balance[0] = balances[1];
        } else if (inName.equalsIgnoreCase(ownerNames[2])) {
            balance[0] = balances[2];
        } else if (inName.equalsIgnoreCase(ownerNames[3])) {
            balance[0] = balances[3];
        } else if (inName.equalsIgnoreCase(ownerNames[4])) {
            balance[0] = balances[4];
        }
        return balance[0];
    }

    private static double enterAmount(double balance) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your balance is: " + balance + "$" +
                "\nEnter the sum amount wish to get");

        double amount = in.nextDouble();
        if (amount<=0){
            System.out.println("error");
            return 0.0;
        }
        return amount;
    }

    private static String calculateOperation(double balance, double amount) {

        double commission = amount * 0.05;
        String endOfOperation = "End of operation";

        if (amount + commission <= balance) {
            balance = balance - amount - commission;
            System.out.println("OK " + "Your balance now: " + balance
                    + " Commission: " + commission);
        } else {
            System.out.println("Your have not enough money on your balance");
        }
        return endOfOperation;

    }
}