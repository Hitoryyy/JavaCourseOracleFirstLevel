package Java_First_Level_Lecture_5;

public class Human {

    // что бы напрямую не писать в коде значения (hard code) правильнее использовать константы
    private static final int MAX_AGE = 100;
    private static final int MIN_AGE = 0;

    private String name;
    private byte age; // благодаря инкапсуляции можно менять тип данных и весь проект не сломается

    public Human (String name, int age) {
        setAge(age);
        setName(name);
    }

    public void voice() {
        System.out.println("Hello, my name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= MIN_AGE && age <= MAX_AGE) { // используем константы для исключения hard code
            this.age = (byte) age; // достаточно сделать только каст в методе set благодаря инкапсуляции
        } else {
            System.out.println("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE); // так же использование констант
        }
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age =" + age + "]" ;
    }
}
