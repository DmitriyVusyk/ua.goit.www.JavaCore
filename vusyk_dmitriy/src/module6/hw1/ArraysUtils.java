package module6.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * You need to create two classes ArraysUtils and UserUtils with static and final methods
 * and use ArraysUtils methods in HW2 to symplify it.
 * <p>
 * Create ArraysUtils with following methods
 * <p>
 * sum(int array[])
 * min(int array[])
 * max(int array[])
 * maxPositive(int array[])
 * multiplication  (int array[])
 * modulus(int array[])
 * secondLargest(int array[])
 * <p>
 * these should be just copied from your HW2.
 * <p>
 * In addition add new methods
 * <p>
 * int[] reverse(int[] array)
 * int[] findEvenElements(int[] array)
 */
public final class ArraysUtils {

    private ArraysUtils() {
    }

    public static final int getSum(int... numbs) {
        int sum = 0;

        for (int n : numbs) {
            sum += n;
        }
        return sum;
    }

    public static final double getSum(double... numbs) {
        int sum = 0;

        for (double n : numbs) {
            sum += n;
        }
        return sum;
    }

    public static final int getMin(int[] arr) {
        int min = arr[0];

        for (int item : arr) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static final double getMin(double[] arr) {
        double min = arr[0];

        for (double item : arr) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static final int getMax(int[] arr) {
        int max = arr[0];

        for (int item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static final double getMax(double[] arr) {
        double max = arr[0];

        for (double item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static final int getMaxPositive(int[] arr) {
        int maxPositive = arr[0];

        for (int item : arr) {
            if ((item > maxPositive) && (item > 0))
                maxPositive = item;
        }
        if (maxPositive <= 0) {
            System.out.println("В массиве int нет позитивных чисел");
        }
        return maxPositive;
    }

    public static final double getMaxPositive(double[] arr) {
        double maxPositive = 0;

        for (double item : arr) {
            if ((item > maxPositive) && (item > 0))
                maxPositive = item;
        }
        if (maxPositive <= 0) {
            System.out.println("В массиве double нет позитивных чисел");
        }
        return maxPositive;
    }

    public static final int getMultiplication(int[] arr) {
        int multiplication = arr[0];

        for (int item : arr) {
            multiplication *= item;
        }
        return multiplication;
    }

    public static final double getMultiplication(double[] arr) {
        double multiplication = arr[0];

        for (double item : arr) {
            multiplication *= item;
        }
        return multiplication;
    }

    public static final int getModulusFirstLastNumb(int[] arr) {
        int firstNumb = arr[0];
        int lastNumb = arr[arr.length - 1];
        int modulus = firstNumb % lastNumb;

        return modulus;
    }

    public static final double getModulusFirstLastNumb(double[] arr) {
        double firstNumb = arr[0];
        double lastNumb = arr[arr.length - 1];
        double modulus = firstNumb % lastNumb;

        return modulus;
    }

    public static final int getSecondLargesNumb(int[] arr) {

        int max = arr[0];
        int secondLarges = 0;
        int middleNumb = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > max) || ((arr[i] > secondLarges) && (arr[i] != max))) {
                secondLarges = middleNumb;
                middleNumb = max;
                max = arr[i];
            }
        }

        return secondLarges;
    }

    public static final double getSecondLargesNumb(double[] arr) {

        double max = arr[0];
        double secondLarges = 0;
        double middleNumb = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > max) || ((arr[i] > secondLarges) && (arr[i] != max))) {
                secondLarges = middleNumb;
                middleNumb = max;
                max = arr[i];
            }
        }

        return secondLarges;
    }

    public static final int[] reverse(int[] array) {

        int buffer;

        for (int i = 0, n = array.length - 1; i < array.length / 2; i++, n--) {
            buffer = array[i];
            array[i] = array[n];
            array[n] = buffer;
        }
        return array;
    }

    public static final int[] findEvenElements(int[] array) {

        List<Integer> arrayWithEvenNumbers = new ArrayList<>();

        if (array.length == 0) {
            System.out.println("ArrayIsEmpty");
            return null;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                arrayWithEvenNumbers.add(array[i]);
            }
        }

        int[] newArray = new int[arrayWithEvenNumbers.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrayWithEvenNumbers.get(i);
        }

        return newArray;
    }

}
