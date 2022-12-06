package Java_First_Level_Lecture_9.HumanExcep;

import java.util.regex.Pattern;

public class HumanEx {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 100;

    private String name;
    private int age;

    public HumanEx(String name, int age) throws HumanNameException, HumanAgeException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws HumanNameException {
        if (Pattern.matches("^[A-Z][a-z]{1,15}$", name)) {
            this.name = name;
        } else {
            throw new HumanNameException("Wrong name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HumanAgeException {
        if (age >= MIN_AGE && age <= MAX_AGE) {
            this.age = age;
        } else {
            throw new HumanAgeException("Wrong age, use age from "
                    + MIN_AGE + "to " + MAX_AGE);
        }
    }

    @Override
    public String toString() {
        return "Human [name: " + name + ", age: " + age + "]";
    }
}
