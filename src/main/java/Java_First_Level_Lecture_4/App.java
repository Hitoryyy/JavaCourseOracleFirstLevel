package Java_First_Level_Lecture_4;

public class App {

    public static void main(String[] args) {

        Dog sharik = new Dog("Sharik", 2);
        System.out.println(sharik.name);

        System.out.println(sharik);
        sharik.makeVoice();

        Dog sharik2 = new Dog("Sharik2", 2);
        System.out.println(sharik2);
        System.out.println(sharik.equals(sharik2));

    }


}
