package Java_First_Level_Lecture_6;

public class AppStringBuilder {
    public static void main(String[] args) {
        String name3 = new String("Vasya");
        String name4 = name3.intern(); // name3 в хипе, intern() ищет такую строку в пуле строк
        //  если находит - возвращает на неё ссылку
        // если не находит - помещает её в пулл строк
        String name1 = "Vasya";
        String name2 = "Vasya";


        System.out.println(name1 == name2); // true т.к. строка уже есть в пуле строк
        System.out.println(name1 == name3); // false т.к. name3 создаётся уже как новый объект и его
        // в пуле строк нет. ссылки разные

        System.out.println(name1.equals(name3)); // true. в данном случае идёт сравнение не ссылок,
        // а сравнение строк посимвольно

        // Строка - это массив чаров (char)
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        System.out.println(helloArray.length);

        // charAt() - по позиции ищет символ
        String s = "mama mila ramu";
        System.out.println(s.charAt(6));

        // IndexOf() - ищет символ сначала строки
        // LastIndexOf() - ищет символ с конца строки
        // оба эти метода являеются перегруженными
        // можно указать с какого символа искать
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 2));

        // находим все буквы a в строке
        int index = -1;
        do {
            index = s.indexOf('a', index + 1);
            System.out.println(index);
        } while (index != -1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(s.indexOf("il"));
        System.out.println(s.lastIndexOf("il"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Из строки делаем подстроку
        String exam = "Language";
        String sub = exam.substring(2);
        System.out.println(sub);
        System.out.println("~~~~~~~~~~~~~");
        sub = exam.substring(2, 4);
        System.out.println(sub);

        // Замена элементов строки
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(exam.replace('L', 'l'));
    }
}
