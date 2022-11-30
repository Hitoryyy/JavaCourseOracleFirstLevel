package Java_First_Level_Lecture_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = new int[10];

        // копирование из одного массива в другой
        // например для расширения
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
