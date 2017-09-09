package module6.hw3;

import module6.hw2.User;

import java.util.ArrayList;
import java.util.List;

/**
 * UserUtils с последующими методами:
 * User[] uniqueUsers(User[] users) – находит и возвращает уникальных пользователей (пользователи одинаковы, когда все их поля совпадают)
 * User[] usersWithContitionalBalance(User[] users, int balance) – находит и возвращает пользователей, чей баланс равен заданному
 * User[]  paySalaryToUsers(User[] users) – начисляет зарплату в баланс каждому пользователю
 * long[] getUsersId(User[] users) – возвращает массив идентификаторов пользователей
 * User[] deleteEmptyUsers(User[] users) – находит и удаляет пустые элементы из массива (в результате возвращается новый массив с меньшим размером)
 * <p>
 * Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перезаписаны в других классах.
 * <p>
 * Создайте класс UsersMain с методом main, где создайте несколько тестовых пользователей  и продемонстрируйте, как работает каждый метод из UserUtils.
 */
public class UserUtils {

    private UserUtils() {
    }

    static User[] uniqueUsers(User[] users) {

        if (users == null) {
            throw new NullPointerException();
        }

        List<User> uniqueUsers = new ArrayList<>();

        for (int i = 0; i < users.length; i++) {

            if (users[i] == null) {
                continue;
            }

            for (User user : users) {
                if (users[i] != user) {
                    uniqueUsers.add(users[i]);
                }
                break;
            }

        }
        return uniqueUsers.toArray(new User[uniqueUsers.size()]);
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {

        if (users == null) {
            throw new NullPointerException();
        }

        List<User> usersWithContitionalBalance = new ArrayList<>();

        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    usersWithContitionalBalance.add(user);
                }
            }
        }

        return usersWithContitionalBalance.toArray(new User[usersWithContitionalBalance.size()]);
    }

    static final User[] paySalaryToUsers(User[] users) {

        if (users == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                User userNew = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(),
                        users[i].getBalance() + users[i].getSalary());
                users[i] = userNew;
            }
        }

        return users;
    }

    static final long[] getUsersId(User[] users) {

        if (users == null) {
            throw new NullPointerException();
        }

        List<Long> idList = new ArrayList<>();

        for (User user : users) {
            if (user != null) {
                idList.add(user.getId());
            }
        }

        long[] usersId = new long[idList.size()];

        for (int i = 0; i < usersId.length; i++) {
            usersId[i] = idList.get(i);
        }

        return usersId;
    }

    static User[] deleteEmptyUsers(User[] users) {

        if (users == null) {
            throw new NullPointerException();
        }

        List<User> userList = new ArrayList<>();

        for (User user : users) {
            if (user != null) {
                userList.add(user);
            }
        }
        return userList.toArray(new User[userList.size()]);
    }

}
