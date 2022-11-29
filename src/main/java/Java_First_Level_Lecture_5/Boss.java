package Java_First_Level_Lecture_5;

// пример синглтона (когда можно создать только один объект класса или когда у класса
// может быть только один объект)
public class Boss { // бос может быть только один его нельзя сделать 2 или больше
    private static Boss instance = null;
    private String name;

    public static Boss getInstance(String name) { // метод создания одного объекта
        if (instance == null) {
            instance = new Boss(name);
        }
        return instance;
    }

    private Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boss [name=" + name + "]";
    }

}
