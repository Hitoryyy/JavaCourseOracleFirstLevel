package Java_First_Level_Lecture_8;

public class Shirt extends Clothing {

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
}
