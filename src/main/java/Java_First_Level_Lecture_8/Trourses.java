package Java_First_Level_Lecture_8;

public class Trourses extends Clothing implements Cleanable {

    public Trourses(String name, int size, int price) {
        super(name, size, price);
    }

    @Override
    public void wash() {
        System.out.println("Trousers is clean");
    }

    @Override
    public void doClean(int temp){
        if (temp < 30) {
            System.out.println("Trousers is not clean");
        } else {
            System.out.println("Trourses is clean");
        }
    }
}
