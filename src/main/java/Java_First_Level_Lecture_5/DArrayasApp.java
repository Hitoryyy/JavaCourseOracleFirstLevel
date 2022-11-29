package Java_First_Level_Lecture_5;

import java.util.Arrays;

public class DArrayasApp {

    public static void main(String[] args) {

        int[][] wArray = {{1, 46, 77, 2}, {1, 2, 7,}, {6, 6, 1},
                {1}, {3, 1}, null, {0, 11}};

        // Распечатка многомерного массива
        System.out.println(Arrays.deepToString(wArray));
        // переинициализировать элемент массива, если массив будет содержать элементы
        // null можно получить null pointer exception
        wArray[5] = new int[]{6, 1, 22, 4, 1, 4};
        System.out.println(Arrays.deepToString(wArray));
        // с помощью for ich
        for (int[] is : wArray) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        // получение длины массива
        System.out.println(wArray.length);
        // получени длины элемента массива
        System.out.println(wArray[1].length);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //просмотр типов элементов массива, скольки мерный(глубина массива)
        System.out.println(wArray.getClass().getName().indexOf('I'));



    }
}
