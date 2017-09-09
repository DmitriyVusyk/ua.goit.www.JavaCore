package module6.hw3;

import module6.hw2.User;

import java.util.Arrays;

/**
 * Создайте класс UsersMain с методом main, где создайте несколько тестовых пользователей
 * и продемонстрируйте, как работает каждый метод из UserUtils.
 */
public class UserMain {

    public static void main(String[] args) {
        User user1 = new User(1, "James", "Smith", 100, 0);
        User user2 = new User(2, "Sarah", "Konor", 200, 100);
        User user3 = new User(1, "James", "Smith", 100, 0);
        User user4 = new User(3, "Mark", "Smith", 50, 150);
        User user5 = new User(4, "James", "Konor", 10, 0);
        User user6 = new User(5, "James", "Smith", 20, 0);

        User[] users = {user1, user2, null, user3, null, user4, user5, user6, null, null};

        System.out.println("Delete Empty users:" + Arrays.toString(UserUtils.deleteEmptyUsers(users)));
        System.out.println("Users Id: " + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("Users after salary: " + Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println("Unique users: " + Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println("Users with balance: " + Arrays.toString(UserUtils.usersWithContitionalBalance(users,100)));



    }
}
