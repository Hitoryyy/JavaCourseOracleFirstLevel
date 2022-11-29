package Java_First_Level_Lecture_5;

public class App_Recursion {

    public static int counter = 0;

    public static void main(String[] args) {
        method(0);
        System.out.println();
        System.out.println(fibonachi(10));
        System.out.println(counter);
    }

    // рекурсивный метод
    public static void method(int i) {
        System.out.println(i);
        if (i < 10) {
            method(i + 1); // рекурсия - вызов методом самого себя
        }
        System.out.println(i);
    }

    // вычисление ряда фибоначи с помощью рекурсии
    public static long fibonachi(long number) {
        counter++;
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibonachi(number - 1) + fibonachi(number - 2);
    }
}
