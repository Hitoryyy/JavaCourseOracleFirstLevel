package Java_First_Level_Lecture_9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionError {

    public static void main(String[] args) {
        // пример исключения Error
        ArrayList theList = new ArrayList();
        while (true) {
            String theString = "A test String";
            theList.add(theString);
            if (theList.size() % 1000000 == 0) {
                System.out.println("List now has " + theList.size() / 1000000 + " m");
            }
        }
    }
}
