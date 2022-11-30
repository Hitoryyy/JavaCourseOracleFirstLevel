package Java_First_Level_Lecture_6;

public class Books {

    private String name;
    private int year;

    public Books(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books [name: " + name + " year: " + year + "]";
    }
}
