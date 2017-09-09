package module4;


/**
 * You need to following structure:
 * abstarct class Bank and three classes that extends it: USBank, EUBank, ChinaBank.
 * Enum Currency. Class User that represents User of our Bank System.
 * Interface BankSystem and its implementation BankSystemImpl.
 * <p>
 * Create Main class with main method, where you should create 6 Users:
 * 2 of USBank, 2 of EUBank and 2 of ChinaBank.
 * Run four different operations with erery User’s baalance and print its objects to console.
 */

class Main {

    public static void main(String[] args) {

        Bank bankOfEngland = new EUBank(1000, "England", Currency.EUR, 25,
                1200, 20, 5000000);
        Bank bankOfAmericaUSA = new USBank(1001, "USA", Currency.USD, 30,
                1100, 22, 6000000);
        Bank bankOfAmericaEurope = new EUBank(1003, "Switzerland", Currency.EUR, 60,
                2000, 10, 10000000);
        Bank capitalBank = new USBank(1298, "USA", Currency.USD, 100,
                1500, 12, 7000000);
        Bank chinaBank = new ChinaBank(1002, "China", Currency.USD, 150,
                200, 55, 3000000);
        Bank firthChinaBank = new ChinaBank(2345, "China", Currency.EUR, 2000,
                50, 100, 2000000);

        User jamesSmith = new User(132144, "James Smith", 40000, 2,
                "Google", 8900, bankOfAmericaUSA);
        User patrikLevis = new User(167097, "Patrik Levis", 100000, 6,
                "Oracle", 10000, bankOfAmericaEurope);
        User vasiliyTkachenko = new User(5456286, "Vasiliy Tkachenko", 3000, 7,
                "GameDev", 1200, bankOfEngland);
        User dragoshBernard = new User(937846, "Dragosh Bernard", 10000, 3,
                "Moldova Software Inc", 1000, capitalBank);
        User leoZyao = new User(987543, "Leo Zyao", 800, 9, "Sony",
                120, chinaBank);
        User kwangZong = new User(486634, "Kwang Zong", 1000, 12,
                "Kabata", 200, firthChinaBank);

        User[] userArray = {jamesSmith, patrikLevis, vasiliyTkachenko, dragoshBernard, leoZyao, kwangZong};

        BankSystemImpl bankSystem = new BankSystemImpl();

        //демонстрация работы операций с балансом
        for (User anUserArray : userArray) {
            System.out.println("================================================");
            System.out.println(anUserArray.toString());
            bankSystem.fundUser(anUserArray, 200);
            System.out.println("Balance after founding: " + anUserArray.getBalance());
            bankSystem.withdrawOfUser(anUserArray, 100);
            System.out.println("Balance after withdrawal: " + anUserArray.getBalance());
            bankSystem.transferMoney(anUserArray, userArray[(int) (Math.random() * 6)], 150);
            bankSystem.paySalary(anUserArray);
            System.out.println(anUserArray.toString());
        }
    }
}
