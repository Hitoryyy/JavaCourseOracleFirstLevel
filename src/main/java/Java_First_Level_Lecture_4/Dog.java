package Java_First_Level_Lecture_4;

public class Dog {

    public String name;
    public int age;
    public static String type = "Kolly"; // общее для всех

    public Dog(String NewName, int NewAge) {
        name = NewName;
        age = NewAge;
        makeVoice(); // при создании собака будет гавкать
    }

    public void makeVoice() {
        System.out.println("Bark Bark");
    }

    // собака умеет считать сумму любого количества значений
    public int calculate(int... dogsNumbers) { // аргумент с переменным числом значений (не массив)
        int sum = 0;
        for (int i = 0; i < dogsNumbers.length; i++ ) {
            sum += dogsNumbers[i];
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
