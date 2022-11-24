package Java_First_Level_Lecture_1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        for (String string: args) {
            System.out.println(string);
        }
        hello();
    }

    private static void hello() {
        System.out.println("method hello");
    }
}
