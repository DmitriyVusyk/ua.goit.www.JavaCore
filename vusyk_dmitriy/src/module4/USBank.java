package module4;

/**
 * USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 * лимит пополнения - 10000, если EUR, и нет лимита, если USD
 * месячная ставка - 1% на USD и 2% на EUR
 * комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 * 6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();

        switch (currency) {
            case USD:
                return Integer.MAX_VALUE;
            case EUR:
                return 1000;
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
                return 2;
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
                return (summ <= 1000) ? 6 : 8;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

}