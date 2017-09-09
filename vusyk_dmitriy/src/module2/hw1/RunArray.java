package module2.hw1;

/**
 * Input: array with size = 10 can be of one of two data types: int and double. Calculate:
 * sum
 * min/max
 * max positive
 * multiplication
 * modulus of first and last element
 * second largest element
 * <p>
 * As a result you should have methods with following names :
 * sum(int array[]), sum(double[])
 * min(int array[]), min(double[])
 * max(int array[]), max(double[])
 * maxPositive(int array[]), maxPositive(double array[]),
 * multiplication  (int array[]), multiplication (double[])
 * modulus(int array[]), modulus(double[])
 * secondLargest(int array[]), secondLargest(double[])
 */

public class RunArray {

    public static int getSum(int... numbs) {
        int sum = 0;

        for (int n : numbs) {
            sum += n;
        }
        return sum;
    }

    public static double getSum(double... numbs) {
        int sum = 0;

        for (double n : numbs) {
            sum += n;
        }
        return sum;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];

        for (int item : arr) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static double getMin(double[] arr) {
        double min = arr[0];

        for (double item : arr) {
            if (item < min)
                min = item;
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static double getMax(double[] arr) {
        double max = arr[0];

        for (double item : arr) {
            if (item > max)
                max = item;
        }
        return max;
    }

    public static int getMaxPositive(int[] arr) {
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

    public static double getMaxPositive(double[] arr) {
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

    public static int getMultiplication(int[] arr) {
        int multiplication = arr[0];

        for (int item : arr) {
            multiplication *= item;
        }
        return multiplication;
    }

    public static double getMultiplication(double[] arr) {
        double multiplication = arr[0];

        for (double item : arr) {
            multiplication *= item;
        }
        return multiplication;
    }

    public static int getModulusFirstLastNumb(int[] arr) {
        int firstNumb = arr[0];
        int lastNumb = arr[arr.length - 1];
        int modulus = firstNumb % lastNumb;

        return modulus;
    }

    public static double getModulusFirstLastNumb(double[] arr) {
        double firstNumb = arr[0];
        double lastNumb = arr[arr.length - 1];
        double modulus = firstNumb % lastNumb;

        return modulus;
    }

    public static int getSecondLargesNumb(int[] arr) {

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

    public static double getSecondLargesNumb(double[] arr) {

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


    public static void main(String[] args) {

        int arrInt[] = new int[10];
        double arrDouble[] = new double[10];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) (Math.random() * 21 - 10);
        }

        for (int j = 0; j < arrDouble.length; j++) {
            arrDouble[j] = (Math.random() * 20 - 10);
        }

        System.out.println("Массив int: ");

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }

        System.out.println("\nМассив double: ");

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrDouble[i] + " ");
        }

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
