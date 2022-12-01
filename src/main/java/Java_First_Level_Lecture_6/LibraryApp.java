package Java_First_Level_Lecture_6;

import java.awt.print.Book;
import java.io.IOException;
import java.util.Random;

public class LibraryApp {

    public static void main(String[] args) throws IOException {

        int libSize = 32;
        Library karaskevich = new Library("Pushkin", libSize);

        for (int i = 0; i < libSize; i++) {
            karaskevich.putBook(new Books("book" + (int) (Math.random() * 100),
                    (int)(Math.random() * 100 + 1000)), i);
        }

        System.out.println("|--------------------|");
        karaskevich.booksOderThen(1950);

        //System.out.println(karaskevich);
        System.out.println("|---------------------------|");

        int libsize1 = 3;
        Library library = new Library("Karaskevich", libsize1);


        for (int i = 0; i < libsize1; i++) {
            library.putBook();
        }

        System.out.println(library);
    }
}
