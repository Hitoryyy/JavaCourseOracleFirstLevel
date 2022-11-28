package Java_First_Level_Lecture_4;

import static java.lang.Math.PI; // статический импорт числа ПИ
import static java.lang.Math.*; // статический импорт всего из пакета Math

public class App {

    public static void main(String[] args) {

        Dog dog = new Dog("Re");

        Dog sharik = new Dog("Sharik", 2);
        System.out.println(sharik.name);

        System.out.println(sharik);
        sharik.makeVoice();

        Dog sharik2 = new Dog("Sharik2", 2);
        System.out.println(sharik2);
        System.out.println(sharik.equals(sharik2));

        int result = sharik.calculate(1, 4, 7, 3); //сумма значений массива
        System.out.println(result);

        sharik.name = "Bobik";
        System.out.println(sharik);
        System.out.println(sharik2);

        sharik.type = "Mops"; // не рекомендуется т.к. static
        System.out.println(sharik.type);
        System.out.println(sharik2.type);
        System.out.println(Dog.type);

        System.out.println();

        System.out.println(sum(2, 7));

        int i1 = 3;
        int i2 = 5;
        System.out.println(sum(4.1, 3.1));

        System.out.println(PI);
        System.out.println(E);
    }

    // Перегруженные методы
    public static int sum(short s1, short s2) {
        System.out.println("sum(short s1, short s2)");
        return s1 + s2;
    }

    public static double sum(double s1, double s2) {
        System.out.println("sum(double s1, double s2)");
        return s1 + s2;
    }
}
