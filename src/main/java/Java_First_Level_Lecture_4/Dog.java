package Java_First_Level_Lecture_4;

public class Dog {

    public String name;
    public int age;

    public Dog(String NewName, int NewAge) {
        name = NewName;
        age = NewAge;
    }

    public void makeVoice() {
        System.out.println("Bark Bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
