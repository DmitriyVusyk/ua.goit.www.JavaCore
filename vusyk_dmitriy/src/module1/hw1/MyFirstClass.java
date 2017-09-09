package module1.hw1;

public class MyFirstClass {

    public static void main (String[]args){

        FirstClass one = new FirstClass();
        SecondClass two = new SecondClass();
        ThirdClass three = new ThirdClass();
        Fourth four = new Fourth();
        Fifth five = new Fifth();

        System.out.println("FirstClass выводит: " + one.firstString);
        System.out.println("SecondClass выводит: " + two.secondString);
        System.out.println("ThirdClass выводит: " + three.thirdString);
        System.out.println("Fourth выводит: " + four.fourthString);
        System.out.println("Fifth выводит: " + five.fifthString);


    }

}
