package Java_First_Level_Lecture_5;

import java.util.Arrays;

public class App_2 {
    public static void main(String[] args) {

        int[] myArray = new int[4]; // вариант создания
        int[] myArray1 = {1, 5, 6, 9, 7}; // ещё вариант
        int[] myArray2;

        myArray2 = new int[]{2, 5, 7, 3, 4}; //  и такой

        // печать массивов

        System.out.println(myArray2); // не очень читабельно

        // через класс Arrays - класс для работы с массивами
        System.out.println(Arrays.toString(myArray2));

        // заполнение массива с помощью цикла
        int[] myArray3 = new int[25];
        for (int count = 0; count < myArray3.length; count++) {
            myArray3[count] = count;
        }

        System.out.println(Arrays.toString(myArray3));

        // цикл for ich (форич)
        // вывод всех элементов массива
        for (int item : myArray2) {
            System.out.println(item);
        }

        // подсчёт суммы всех элементов массива
        int summ = 0;
        for (int item : myArray3) {
            summ = summ + item;
        }
        System.out.println("Сумма всех элементов массива: " + summ);


        // влияние на массив объектов в данном примере изменение эелементов с помощью цикла for ich
        // массив объектов и его вывод
        F[] fArray = {new F(1), new F(5), new F(6), new F(4), new F(2)};

        System.out.println(Arrays.toString(fArray));

        // вывод
        for (F i : fArray) {
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~");
        // изменение элементов
        for (F i: fArray) {
            System.out.println(i.f++);
        }
        System.out.println("~~~~~~~~~~~~~~~~");
        for (int i = 0; i < fArray.length; i++) {
            System.out.println(fArray[i]);
        }

        // массив с аргументами метода main вывод
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Arrays.toString(args));
        System.out.println(args[1] + 25);
        // парсим (прибавляем к элементу массива № 1, который = 25 ещё 25)
        System.out.println(Integer.parseInt(args[1]) + 25);
    }
}

class F {

    int f;

    public F(int f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return String.valueOf(f); //- как вариант просто возвращать значения f
        //return "F [f=" + f + "]"; // ну или так
    }
}