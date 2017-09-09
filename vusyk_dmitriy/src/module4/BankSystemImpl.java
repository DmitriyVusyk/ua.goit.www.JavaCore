package module4;

/**
 * Created by dmytrovusyk on 19.02.17.
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        if (amount < 0) {
            System.out.println("Error. Amount is negative.");
        } else if (amount <= user.getBank().getLimitOfWithdrawal()) {
            user.setBalance(user.getBalance() - amount -
                    ((amount * user.getBank().getCommission(amount)) / 100));
        } else {
            System.out.println("Error. Amount is too big!");
        }
    }

    @Override
    public void fundUser(User user, int amount) {

        user.getBank().getLimitOfFunding();
        user.getBank().getCommission(amount);

        if (amount < 0) {
            System.out.println("Error. Amount is negative.");
        } else if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount -
                    ((amount * user.getBank().getCommission(amount)) / 100));
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (amount < 0) {
            System.out.println("Error. Amount is negative.");
        } else {
            fromUser.setBalance(fromUser.getBalance() - amount -
                    (amount * fromUser.getBank().getCommission(amount) / 100));
            toUser.setBalance(toUser.getBalance() + amount);
            System.out.println("From user " + fromUser.getName() + " to user " + toUser.getName()
                    + " was transferred " + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
