package Java_First_Level_Lecture_6;

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

    public void booksOderThen(int year) {
        for (Books book : books) {
            if (book.getYear() < year) {
                System.out.println(book);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Books book : books) {
            sb.append(book).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
