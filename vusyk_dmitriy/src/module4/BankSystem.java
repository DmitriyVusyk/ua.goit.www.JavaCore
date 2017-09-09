package module4;

/**
 * Создайте следующую структуру:
 * Интерфейс BankSystem и его реализацию BankSystemImpl.
 * <p>
 * Создать интерфейс BankSystem с методами:
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 * и его релизацию.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
