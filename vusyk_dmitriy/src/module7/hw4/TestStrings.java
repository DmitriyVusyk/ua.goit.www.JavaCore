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
public class TestStrings {

    // Test with Strings
    // Time is in nano seconds

    public static void main(String[] args) {

        List<String> integerArrayListSmall = new ArrayList<>(1000);
        List<String> integerArrayListBig = new ArrayList<>(10000);

        List<String> integerLinkedListSmall = new LinkedList<>();
        List<String> integerLinkedListBig = new LinkedList<>();

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

    private static long testAddMethod(List<String> stringList, int capacity) {

        long start = System.nanoTime();

        for (int i = 0; i < capacity; i++) {

            stringList.add("Random String :D");
        }

        long finish = System.nanoTime();

        return finish - start;

    }

    private static void testSetMethod(List<String> stringList) {

        Random random = new Random();

        long start = System.nanoTime();

        stringList.set(1, "Random String :D");

        long finish = System.nanoTime();

        System.out.println("Time of set method to front of list " + (finish - start));

        long start1 = System.nanoTime();

        stringList.set(stringList.size() - 1, "Random String :D");

        long finish1 = System.nanoTime();

        System.out.println("Time of set method to end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        stringList.set(stringList.size() / 2, "Random String :D");

        long finish3 = System.nanoTime();

        System.out.println("Time of set method to middle of list: " + (finish3 - start3));
    }

    private static void testGetMethod(List<String> stringList) {

        long start = System.nanoTime();

        stringList.get(1);

        long finish = System.nanoTime();

        System.out.println("Time of get method from front of list " + (finish - start));

        long start1 = System.nanoTime();

        stringList.get(stringList.size() - 1);

        long finish1 = System.nanoTime();

        System.out.println("Time of get method from end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        stringList.get(stringList.size() / 2);

        long finish3 = System.nanoTime();

        System.out.println("Time of set method to middle of list: " + (finish3 - start3));
    }

    private static void testRemoveMethod(List<String> stringList) {


        long start = System.nanoTime();

        stringList.remove(1);

        long finish = System.nanoTime();

        System.out.println("Time of remove method from front of list " + (finish - start));

        long start1 = System.nanoTime();

        stringList.remove(stringList.size() - 1);

        long finish1 = System.nanoTime();

        System.out.println("Time of remove method from end of list: " + (finish1 - start1));

        long start3 = System.nanoTime();

        stringList.remove(stringList.size() / 2);

        long finish3 = System.nanoTime();

        System.out.println("Time of remove method to middle of list: " + (finish3 - start3));

    }
}
