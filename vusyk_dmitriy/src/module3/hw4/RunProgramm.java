package module3.hw4;

/**
 * Created by dmytrovusyk on 13.02.17.
 */
public class RunProgramm {
    public static void main(String[] args) {

        User user1 = new User("Alex", 600, 3, "LuxSoft",
                1500, "$");

        System.out.println(user1.getBalance());

        user1.paySalary();
        System.out.println(user1.getBalance());

        user1.withdraw(100);
        System.out.println(user1.getBalance());

        user1.companyNameLength();

        user1.monthIncreaser(1);
        System.out.println(user1.getMonthsOfEmployment());
    }
}
