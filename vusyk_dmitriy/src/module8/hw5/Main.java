package module8.hw5;

import module8.hw1.Country;
import module8.hw2.Food;
import module8.hw4.IManageSystemImpl;

import java.util.HashMap;
import java.util.Map;


/**
 * Проверьте работу Manage System в классе Main (на примере 5+ продуктов).
 */
public class Main {
    public static void main(String[] args) {

        Food goroshek = new Food("Goroshek", Country.ENGLAND, 60);
        Food kolbasa = new Food("Kolbasa", Country.GERMANY, 15);
        Food moloko = new Food("Moloko", Country.ITALY, 5);
        Food hleb = new Food("Hleb", Country.UKRAINE, 4);
        Food sigarety = new Food("Sigarety", Country.POLAND, 999999);
        Food pivoP = new Food("Pivo", Country.POLAND, 90);

        Map<Food, Double> shopDB = new HashMap<>();

        IManageSystemImpl manager = new IManageSystemImpl();

        manager.setDatabase(shopDB);

        System.out.println("Сохраняем горошек, колбасу, хлеб, пиво польское:");
        manager.save(goroshek, 100);
        manager.save(kolbasa, 200);
        manager.save(hleb, 50);
        manager.save(pivoP, 500);
        System.out.println("==================");
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");

        System.out.println("Меняем цену горошка нв 200:");
        manager.save(goroshek, 200);
        System.out.println("==================");
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");

        System.out.println("Добавляем молоко: ");
        manager.save(moloko, 80);
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");

        System.out.println("Изменим страну обьекта молоко и положим его в БД: ");
        moloko.setCountry(Country.UKRAINE);
        manager.save(moloko);
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");


        System.out.println("Добавим сигареты");
        manager.save(sigarety, 20);
        System.out.println("Сигареты вредные и дорогие по этому сразу же их удалим");
        manager.delete(sigarety);
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");

        System.out.println("Найдем продукт с айди 1");
        System.out.println(manager.getById(1));
        System.out.println("==================");

        System.out.println("Посмотрим какие у нас есть продукты в БД:");
        System.out.println(manager.getProducts());
        System.out.println("==================");

        System.out.println("Посмотрим сколько стоит пиво:");
        manager.getPrice(pivoP);
        System.out.println("==================");

        System.out.println("Удалим пиво по id, оно тоже вредное, еще и дорогое:");
        manager.deleteById(5);
        System.out.println("Наша БД: ");
        System.out.println(manager.getDatabase());
        System.out.println("==================");

        System.out.println("Посмотрим на список цен:");
        System.out.println(manager.getPrices());
        System.out.println("==================");

    }
}