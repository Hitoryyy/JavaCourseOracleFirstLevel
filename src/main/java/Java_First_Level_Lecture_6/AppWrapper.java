package Java_First_Level_Lecture_6;

import java.util.ArrayList;

public class AppWrapper {
    public static void main(String[] args) {

        //~~~~~~~~~~~~ Классы обёртки для примитивных типов для представления их как объектов ~~~~~~~~~~~~~~~~~

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(25);

        System.out.println(intList.get(0).toString());
        System.out.println(intList.get(0).getClass().getName());
        System.out.println(intList.get(0) + 25);
        System.out.println("~~~~~~~~~~~~~");

        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        System.out.println(charList.get(0) + 25);
        System.out.println("~~~~~~~~~~~~~~~~");

        Integer x, y, z, n;
        x = 15;
        y = 15;
        n = new Integer(15);

        z = Integer.valueOf(15);

        System.out.println(x == y);
        System.out.println(x == n);

        // С помощью обёрток можно парсить строки в числа
    }
}
