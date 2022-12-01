package Java_First_Level_Lecture_7;

public class Shirt extends Clothing {

    private char color;

    public Shirt(String name, int size, int price, char color) {
        super(name, size, price);
        setColor(color);
    }

    @Override
    public void wash() { // нельзя сужать область видимости, но можно расширять
        System.out.println("Shirt is clean");
        setSize(getSize() - 1); // напрямую обратиться не можем т.к. инкапсуляция,
        // можно только через метод (setSize - изменение, getSize - чтение)
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shirt [Name:" + getName() + ", Size:" +
                getSize() + ", Price:" + getPrice() + ", Color:" + color + "]";
    }
}
