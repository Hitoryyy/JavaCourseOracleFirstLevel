package Java_First_Level_Lecture_6;

import java.awt.print.Book;
import java.util.Random;

public class LibraryApp {

    public static void main(String[] args) {

        int libSize = 32;
        Library karaskevich = new Library("Pushkin", libSize);

        for (int i = 0; i < libSize; i++) {
            karaskevich.putBook(new Books("book" + (int) (Math.random() * 100),
                    (int)(Math.random() * 100 + 1000)), i);
        }

        System.out.println("|--------------------|");
        karaskevich.booksOderThen(1950);

        //System.out.println(karaskevich);

    }
}
