package Java_First_Level_Lecture_2;

// ------------------- Объекты хранятся в хипе (heap) - куче -------------- \\
// объект где ? - в хипе .
// переменные экземпляра класса или поля - хранятся в хипе
public class App {

    long myVar = 2;


    // -------------- Метод хранится в стеке (stack) ------------------------- //
    // для работы метода выделяется стек (stack), локальные переменные хранятся в стеке
    // метод в однопоточном режиме завершает работу - стек очищается.
    public static void main(String[] args) {

        int myInt = 0x156;
        System.out.println(myInt);

        char myChar = '\u0041'; // A
        System.out.println(myChar);
        char myChar1 = '\101'; // A
        System.out.println(myChar1);
        char myChar2 = 65; // A
        System.out.println(myChar2);

//        for (int i = 0; i < 65535; i++) {
//            System.out.println((char) i);
//        }

        System.out.println(Integer.toBinaryString('A'));
        System.out.println((int) 'A');

        double d = 0.1;
//        for (int i = 0; i < 100; i++) {
////            System.out.println(d += d);
//            System.out.println(d = d + 0.1);
//        }

        boolean bool = true;
        System.out.println(bool);

        int myInt1 = 9 + 2;
        System.out.println(myInt1);

        double myDouble = Math.sin(6);
        System.out.println(myDouble);

        long myVar = 5;
        if (true) {
            System.out.println(myVar);
        }

        System.out.println();

        int i = 2;
        int d1 = i++;
        int d2 = ++i;
        i = i++ + ++i;
        System.out.println(d1);
        System.out.println(d2);
        //System.out.println(i);

        System.out.println();

        int j = 2;
        j += j++ + ++j * j++;
        System.out.println(j);

        long l = 1000_000 * (long)1000_1000;
        System.out.println(l);

        float o = (float) 3/4;
        System.out.println(o);
    }
}
