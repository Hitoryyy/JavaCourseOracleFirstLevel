package Java_First_Level_Lecture_8;

public class App11 {

    public static void main(String[] args) {

        Shirt myRedShirt = new Shirt("My shirt", 25,
                500, 'R');

        Clothing cloth = new Shirt("My green shirt", 30,
                237, 'G');

        myRedShirt.setName("My shirt");

        System.out.println(myRedShirt + "\n" + cloth);
    }
}

