package module3.hw3;


import java.util.Date;

/**
 * Создать следующую структуру классов.
 * <p>
 * Класс Course с полями: +
 * Date startDate,
 * String name,
 * int hoursDuration,
 * String teacherName.
 * Создайте 2 конструктора с аргументами
 * startDate, name;
 * hourseDuration, name, teacherName.
 * <p>
 * Класс Student с полями: +
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * С 2 конструкторами с аргументами
 * firstName, lastName, group;
 * lastName, coursesTaken.
 * <p>
 * CollegeStudent унаследован от Student. +
 * Дополнительные поля: String collegeName, int rating, long id.
 * Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
 * <p>
 * Class SpecialStudent унаследован от CollegeStudent. +
 * Дополнительные поля long secretKey, String email.
 * Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 * <p>
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП. +
 * Создайте 5 объектов класса Course. +
 * Создайте объекты других классов, используя все конструкторы. +
 * У вас должно быть 13 объектов в классе Solution. +
 */

public class Solution {
    public static void main(String[] args) {

        Course course1 = new Course("GoJava", 10, "Mr. Anderson");
        Course course2 = new Course(new Date(), "GoJava");
        Course course3 = new Course("GoFrontend", 6, "Mr. Smith");
        Course course4 = new Course(new Date(), "GoFrontend");
        Course course5 = new Course("GoToHell", 10, "Mr. Simon");

        Course[] courses = {course1, course2, course3, course4, course5};
        Student student1 = new Student("Alex", "Lesley", 1);
        Student student2 = new Student("Gorbunow", courses);

        CollegeStudent student3 = new CollegeStudent("Burkowski", courses);
        CollegeStudent student4 = new CollegeStudent("Marek", "Prudzinski", 2);
        CollegeStudent Student5 = new CollegeStudent("St.Blasian Collage", 16, 4158);

        SpecialStudent student6 = new SpecialStudent("Braun", courses);
        SpecialStudent student7 = new SpecialStudent("Kevin", "Muller", 3);
        SpecialStudent student8 = new SpecialStudent(283512);
    }
}
