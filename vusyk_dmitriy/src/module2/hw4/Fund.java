package module2.hw4;

/**
 * Created by dmytrovusyk on 10.02.17.
 */
public class Fund {

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double amount = 100;
        boolean check;


        do {
            check = searchName(ownerName, ownerNames);

        } while (!check);

        double balance = assignedBalances(ownerName, balances, ownerNames);

        System.out.println(calculateOperation(balance, amount));
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

    private static String calculateOperation(double balance, double found) {

        String endOfOperation = "End of operation";

        if (found<=0){
            System.out.println("Error! You have entered false amount! ");
            return  endOfOperation;
        }
        double balanceAfterOperation = balance + found;
        System.out.println("your balance now: " + balanceAfterOperation );
        return endOfOperation;

    }
}
