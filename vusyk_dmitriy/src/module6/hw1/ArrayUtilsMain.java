package module6.hw1;

/**
 * Created by dmytrovusyk on 25.03.17.
 */

import java.util.Arrays;


import static module6.hw1.ArraysUtils.*;
import static module6.hw1.ArraysUtils.reverse;

class ArrayUtilsMain {
    public static void main(String[] args) {

        int arrInt[] = new int[10];
        double arrDouble[] = new double[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) (Math.random() * 21 - 10);
        }

        for (int j = 0; j < arrDouble.length; j++) {
            arrDouble[j] = (Math.random() * 20 - 10);
        }

        System.out.println("Массив int: " + Arrays.toString(arrInt));
        System.out.println("\nМассив double: " + Arrays.toString(arrDouble));
        System.out.println("\nРеверсный массив: " + Arrays.toString(reverse(arrInt)));
        System.out.println("\nЧетные числа массива: " + Arrays.toString(findEvenElements(arrInt)));


        System.out.println("\nСумма чисел массива int: " + getSum(arrInt));
        System.out.println("Сумма чисел массива double: " + getSum(arrDouble));
        System.out.println("Минимальное число в массиве int: " + getMin(arrInt));
        System.out.println("Минимальное число в массиве double: "
                + getMin(arrDouble));
        System.out.println("Максимальное число в массиве int: "
                + getMax(arrInt));
        System.out.println("Максимальное число в массиве double: "
                + getMax(arrDouble));
        System.out.println("Максимальное позитивное число в массиве int: "
                + getMaxPositive(arrInt));
        System.out.println("Максимальное позитивное число в массиве double: "
                + getMaxPositive(arrDouble));
        System.out.println("Перемножение всех чисел массива int: "
                + getMultiplication(arrInt));
        System.out.println("Перемножение всех чисел массива double: "
                + getMultiplication(arrDouble));
        System.out.println("Модуль первого и последнего елемента массива int: "
                + getModulusFirstLastNumb(arrInt));
        System.out.println("Модуль первого и последнего елемента массива double" +
                ": " + getModulusFirstLastNumb(arrDouble));
        System.out.println("Второе по величине число в массиве int: "
                + getSecondLargesNumb(arrInt));
        System.out.println("Второе по величине число в массиве double: "
                + getSecondLargesNumb(arrDouble));


    }
}
