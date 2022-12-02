package Java_First_Level_Lecture_8;

public abstract class Clothing implements Cleanable{

    private String name;
    private int size;
    private int price;
    private static int counter = 0;

    public Clothing(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
        ++counter;
    }

    public abstract void wash();

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name: " + name + ", " + "size: " + size + ", " +
                "price: " + price + "]";
    }
}
