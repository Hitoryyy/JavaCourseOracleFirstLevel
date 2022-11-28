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

        int result = sharik.calculate(1,4,7,3); //сумма значений массива
        System.out.println(result);

        sharik.name = "Bobik";
        System.out.println(sharik);
        System.out.println(sharik2);

        sharik.type = "Mops"; // не рекомендуется т.к. static
        System.out.println(sharik.type);
        System.out.println(sharik2.type);
        System.out.println(Dog.type);
    }

}
