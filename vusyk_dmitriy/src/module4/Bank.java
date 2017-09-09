package module4;

/**
 * Created by dmytrovusyk on 17.02.17.
 * Создайте следующую структуру:
 * 1. Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.
 * <p>
 * Абстрактный класс Bank должен содержать поля:
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 * <p>
 * Создайте get-,set-методы и конструктор с аргументами - всеми полями.
 * Методы:
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
 */

abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    abstract int getLimitOfWithdrawal();

    abstract int getLimitOfFunding();

    abstract int getMonthlyRate();

    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary() {
        return getAvrSalaryOfEmployee() * getNumberOfEmployees();
    }

    Bank(long id, String bankCountry, Currency currency, int numberOfEmployees,
         double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    long getId() {
        return id;
    }

    void setId(long id) {
        this.id = id;
    }

    String getBankCountry() {
        return bankCountry;
    }

    void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    Currency getCurrency() {
        return currency;
    }

    void setCurrency(Currency currency) {
        this.currency = currency;
    }

    int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    long getRating() {
        return rating;
    }

    void setRating(long rating) {
        this.rating = rating;
    }

    long getTotalCapital() {
        return totalCapital;
    }

    void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }
}
