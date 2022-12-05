package Java_First_Level_Lecture_9;

public class ExceptionDemo {

    public static void main(String[] args) {

        Utils theUtils = new Utils();
        try {
            theUtils.doThis();
        } catch (Exception exception) {
            System.out.println("Error");
        }

    }
}

class Utils {

    public void doThis() throws Exception { // здесь исключение никак не обрабатывается
                                            // а передаётсся дальше туда где используется
                                            // этот метод, который использует метод
                                            // с исключением
        doThat();
    }

    public void doThat() throws Exception { // метод говорить что может кинуть исключение
                                            // передает дальше методу который его использует
        if (1 < 2) {
            throw new Exception(); // условие при котором будет брошено исключение
        }
        return;
    }
}
