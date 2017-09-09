package module3.hw4;

/**
 * Создайте класс User со следующими полями:    +
 * String name,
 * int balance,
 * int monthsOfEmployment,
 * String companyName,
 * int salary,
 * String currency.
 * <p>
 * Создайте get-, set-методы и конструктор с аргументами - всеми полями класса. +
 * Напишите методы:
 * void paySalary() - добавляет заработную плату к балансу пользователя +
 * withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях +
 * companyNameLenght - вычисляет длину имя компании +
 * monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth +
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Error! Salary is: " + salary);
        } else {
            this.salary = salary;
        }

    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {
        this.balance += this.salary;
    }

    public void withdraw(int summ) {
        if (summ < 0) {
            System.out.println("Error");
            summ = 0;
        }
        if (getBalance() < 1000) {
            this.balance = (int) (this.balance - summ - (summ * 0.05));
        } else if (getBalance() >= 1000) {
            this.balance = (int) (this.balance - summ - (summ * 0.1));
        }

    }

    public void companyNameLength() {
        System.out.println("Length of Company name is " + this.companyName.length()
                + " chars");

    }

   public void monthIncreaser(int addMonth){
        if (addMonth < 0){
            System.out.println("Error");
            addMonth = 0;
        }
        this.monthsOfEmployment += addMonth;
   }

}
