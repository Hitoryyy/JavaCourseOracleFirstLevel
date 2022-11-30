package Java_First_Level_Lecture_6;

import java.util.Arrays;

public class AppArrayCopy {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = new int[10];

        // Копирование массива с помощью arraycopy
        /* - указываем из какого массива будем копировать;
         *  - указываем с какого элемента будем копировать;
         *  - указываем куда будем копировать - в какой массив;
         *  - указываем в какой элемент будем копировать;
         *  - указываем длину массива который собираемся копировать.*/
        //System.arraycopy(a, 0, b, 0, 4);
        System.out.println(Arrays.toString(b));

        /*  скопировали массив из массива a, начиная со второго элемента
         *   в массив b на позицию третьего элемента, длиной 2 */
        System.arraycopy(a, 2, b, 3, 2);
        System.out.println(Arrays.toString(b));

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo)); // перевод массива в строку
        System.out.println(Arrays.toString(copyTo));
    }
}
