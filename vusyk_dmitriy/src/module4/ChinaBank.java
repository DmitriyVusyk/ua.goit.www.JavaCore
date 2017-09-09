package module4;


/**
 * ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
 * лимит пополнения - 5000, если EUR и 10000, если USD
 * месячная ставка - 1% на USD и 0% на EUR
 * комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 * 10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 100;
            case EUR:
                return 150;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 10000;
            case EUR:
                return 5000;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 1;
            case EUR:
                return 0;
        }
        throw new IllegalArgumentException("Illegal currency");
    }


    @Override
    public int getCommission(int summ) {

        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 3 : 5;
            case EUR:
                return (summ <= 1000) ? 10 : 11;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

}

