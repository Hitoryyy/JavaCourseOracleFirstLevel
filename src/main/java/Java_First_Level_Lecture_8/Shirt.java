package Java_First_Level_Lecture_8;

public class Shirt extends Clothing implements Cleanable {

    private char color;

    public Shirt(String name, int size, int price, char color) {
        super(name, size, price);
        setColor(color);
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[name: " + getName() + ", " + "size: " + getSize() + ", " +
                "price: " + getPrice() + ", color:" + color + "]";
    }

    @Override
    public void wash() {
        System.out.println("Shirt is clean");
        setSize(getSize() - 1);
    }

    @Override
    public void doClean(int temp) {
        if (temp < 30) {
            System.out.println("Shirt is not clean");
        } else if (temp < 50) {
            System.out.println("Shirt is clean");
        } else {
            setSize(getSize() - 1);
            System.out.println("You have new size = " + getSize());
        }
    }
}
