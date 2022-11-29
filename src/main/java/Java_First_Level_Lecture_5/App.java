package Java_First_Level_Lecture_5;

public class App {

    public static void main(String[] args) {
        Human human = new Human("Vasya", 25);
        System.out.println(human);
        human.setAge(250);
        System.out.println(human);

        Human human1 = new Human("Petya", 500);
        System.out.println(human1);

        Boss boss = Boss.getInstance("Vasss"); // создание объекта через метод
        Boss boss1 = Boss.getInstance("Kolaya"); // тот же объект что и boss
        boss1.setName("Masha"); // меняется имя, объект остаётся тем же

        System.out.println(boss);
        System.out.println(boss1);
        System.out.println(boss == boss1); // проверка объектов - один и тот же объект
    }
}
