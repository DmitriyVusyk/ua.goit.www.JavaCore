package module8.hw4;

import module8.hw2.Food;
import module8.hw3.IManageSystem;

import java.util.*;

/**
 * Реализуйте интерфейс IManageSystem для работы с базой данных товаров. Класс должен содержать поле:
 * Map<Food, Double> database
 * <p>
 * Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
 * Поле должно быть доступно только внутри данного класса.
 */

public class IManageSystemImpl implements IManageSystem<Food> {

    private Map<Food, Double> database;

    public Map<Food, Double> getDatabase() {
        return database;
    }

    public void setDatabase(Map<Food, Double> database) {
        this.database = database;
    }

    @Override
    public Food save(Food food, double price) {
        this.database.put(food, price);
        return food;
    }

    @Override
    public Food save(Food food) {

        double foodPrice = this.database.get(food);

        this.database.replace(food, foodPrice);
        return food;
    }

    @Override
    public void delete(Food food) {
        this.database.remove(food);

    }

    @Override
    public Food getById(long id) {

        Food foundedFood = null;

        for (Food key : database.keySet())
            if (key.getId() == id) {
                foundedFood = key;
                break;
            }

        return foundedFood;
    }

    @Override
    public void deleteById(long id) {
        Food food = getById(id);
        this.database.remove(food);
    }

    @Override
    public Double getPrice(Food food) {
        return this.database.get(food);
    }

    @Override
    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(this.database.values());
    }

}
