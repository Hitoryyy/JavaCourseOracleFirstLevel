package Java_First_Level_Lecture_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {

    private String name;
    private Books[] books = null;

    public Library(String name, int size) {
        this.name = name;
        books = new Books[size];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Books getBookByName(String name) {
        for (Books book : books) {
            if (book.getName().equals(name)){
                return book;
            }
        }
        return null;
    }

    public void putBook(Books book, int index) {
        books[index] = book;
    }
    public void putBook() throws IOException {
        // Создаём буфер ридер для чтения байтового потока из консоли
        // тут же ипут стрим для чтения самого потока
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input book name");
        String name = br.readLine(); // для чтения ввода в консоли объект буфер ридер - чтения строки

        System.out.println("Input book year");
        int year = Integer.parseInt(br.readLine()); // прочитать число через рид лайн напрямую не получится
                                                    // поэтому выполняем парсинг через класс интеджер

        System.out.println("Input book index");     // аналогично написанному выше
        int index = Integer.parseInt(br.readLine());

        books[index] = new Books(name, year);
    }

    public void booksOderThen(int year) {
        for (Books book : books) {
            if (book.getYear() < year) {
                System.out.println(book);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Books book : books) {
            sb.append(book).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
