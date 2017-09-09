package module7.hw4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.
 * <p>
 * Измерьте время выполнения этих методов и выведите их в консоль:
 * - add
 * - set
 * - get
 * - remove
 */
public class TestsIntegers {

    // Tests with Integers
    // Time is in nano seconds

    public static void main(String[] args) {

        List<Integer> integerArrayListSmall = new ArrayList<>(1000);
        List<Integer> integerArrayListBig = new ArrayList<>(10000);

        List<Integer> integerLinkedListSmall = new LinkedList<>();
        List<Integer> integerLinkedListBig = new LinkedList<>();

        System.out.println("Add 1000 Integers in Array list: ");
        System.out.println("Time : " + testAddMethod(integerArrayListSmall, 1000));

        System.out.println("Add 10000 Integers in Array list: ");
        System.out.println("Time : " + testAddMethod(integerArrayListBig, 10000));

        System.out.println("Add 1000 Integers in Linked list: ");
        System.out.println("Time : " + testAddMethod(integerLinkedListSmall, 1000));

        System.out.println("Add 10000 Integers in Linked list: ");
        System.out.println("Time : " + testAddMethod(integerLinkedListBig, 10000));

        System.out.println("Set method at ArrayList with 1000 elements: ");
        testSetMethod(integerArrayListSmall);

        System.out.println("Set method at ArrayList with 10000 elements: ");
        testSetMethod(integerArrayListBig);

        System.out.println("Set method at LinkedList with 1000 elements: ");
        testSetMethod(integerLinkedListSmall);

        System.out.println("Set method at LinkedList with 10000 elements: ");
        testSetMethod(integerLinkedListBig);

        System.out.println("Get method from ArrayList with 1000 elements: ");
        testGetMethod(integerArrayListSmall);

        System.out.println("Get method from ArrayList with 10000 elements: ");
        testGetMethod(integerArrayListBig);

        System.out.println("Get method from LinkedList with 1000 elements: ");
        testGetMethod(integerLinkedListSmall);

        System.out.println("Get method from LinkedList with 10000 elements: ");
        testGetMethod(integerLinkedListBig);

        System.out.println("Remove method from ArrayList with 1000 elements: ");
        testRemoveMethod(integerArrayListSmall);

        System.out.println("Remove method from ArrayList with 10000 elements: ");
        testRemoveMethod(integerArrayListBig);

        System.out.println("Remove method from LinkedList with 1000 elements: ");
        testRemoveMethod(integerLinkedListSmall);

        System.out.println("Remove method from LinkedList with 10000 elements: ");
        testRemoveMethod(integerLinkedListBig);



    }

    private static long testAddMethod(List<Integer> integerList, int capacity) {

        long start = System.nanoTime();

        for (int i = 0; i < capacity; i++) {
            integerList.add(1000000);
        }

        long finish = System.nanoTime();

        return finish - start;

    }

    private static void testSetMethod(List<Integer> integerList) {

        Random random = new Random();

        long start = System.nanoTime();

        integerList.set(1, 1000000);

        long finish = System.nanoTime();

        System.out.println("Time of set method to front of list " + (finish - start));

        long start1 = System.nanoTime();

        integerList.set(integerList.size() - 1, 1000000);

        long finish1 = System.nanoTime();

        System.out.println("Time of set method to end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        integerList.set(integerList.size() / 2, 1000000);

        long finish3 = System.nanoTime();

        System.out.println("Time of set method to middle of list: " + (finish3 - start3));
    }

    private static void testGetMethod(List<Integer> integerList) {

        long start = System.nanoTime();

        integerList.get(1);

        long finish = System.nanoTime();

        System.out.println("Time of get method from front of list " + (finish - start));

        long start1 = System.nanoTime();

        integerList.get(integerList.size() - 1);

        long finish1 = System.nanoTime();

        System.out.println("Time of get method from end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        integerList.get(integerList.size() / 2);

        long finish3 = System.nanoTime();

        System.out.println("Time of set method to middle of list: " + (finish3 - start3));
    }

    private static void testRemoveMethod(List<Integer> integerList) {


        long start = System.nanoTime();

        integerList.remove(1);

        long finish = System.nanoTime();

        System.out.println("Time of remove method from front of list " + (finish - start));

        long start1 = System.nanoTime();

        integerList.remove(integerList.size() - 1);

        long finish1 = System.nanoTime();

        System.out.println("Time of remove method from end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        integerList.remove(integerList.size() / 2);

        long finish3 = System.nanoTime();

        System.out.println("Time of remove method to middle of list: " + (finish3 - start3));

    }
}
