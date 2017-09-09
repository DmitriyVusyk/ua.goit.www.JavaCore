package module4;

/**
 * EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
 * лимит пополнения - 20000, если EUR и 10000, если USD
 * месячная ставка - 0% на USD и 1% на EUR
 * комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 * 2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
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
                return 20000;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 1;
        }
        throw new IllegalArgumentException("Illegal currency");
    }


    @Override
    public int getCommission(int summ) {

        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 5 : 7;
            case EUR:
                return (summ <= 1000) ? 2 : 4;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

}

