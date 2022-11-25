package Java_First_Level_Lecture_3;

public class App {

    public static String name = "Vasya";

    public static void main(String[] args) {

        System.out.println(method1(true) & method2(false));


        if (name != null && name.length() > 2) {
            System.out.println(name);
        }

        // Исключающее или
        System.out.println(true ^ false);

        // Побитовый сдвиг (можно двтгать влево вправо причём без учёта знака)
        int i = 0b001100;
        System.out.println(i);
        System.out.println(i = i << 2);
        // Также валидно
        System.out.println(i <<= 2);
        // С помощью класса обёртки выводим целочисленную переменную i в бинарном представлении
        System.out.println(Integer.toBinaryString(i));
        // Отрицательное число в двоичной форме - инвертированное число + 1
        System.out.println();
        int n = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n));
        System.out.println(~n);
        // Что бы из 2 сделать -2 - необходимо проинвертировать (~) и прибавить 1
        System.out.println(~n+1);
        System.out.println();
        // Побитовое "и" и побитовое "или"
        System.out.println(2 | 4);
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(4));

        System.out.println();

        System.out.println(1 + 2); // сложение
        System.out.println("1" + 2); // конкетинация
    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return b;
    }

    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return b;
    }
}
