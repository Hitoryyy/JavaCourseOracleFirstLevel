package Java_First_Level_Lecture_7;

public class Clothing {

    private String name;
    private int size;
    private int price;

    public Clothing(String name, int size, int price) {
        setName(name);
        setPrice(price);
        setSize(size);
    }

    public void wash() {
        System.out.println("Cloth is clean");
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

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing [name: " + name + ", " +
                "size: " + size + ", price: " + price + "]";
    }
}
