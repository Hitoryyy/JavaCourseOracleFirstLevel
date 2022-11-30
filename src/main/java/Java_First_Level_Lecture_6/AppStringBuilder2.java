package Java_First_Level_Lecture_6;

public class AppStringBuilder2 {
    public static void main(String[] args) {

        // Пустой объект размером 16 элементов
        StringBuilder sb = new StringBuilder();
        // добавляем 9 символов в начало
        sb.append("Greetings");
        sb.length(); // length() - кол-во символов
        System.out.println(sb.length());
        sb.capacity(); // capacity() - ёмкость
        System.out.println(sb.capacity());
        System.out.println(" | -------------------------------- |");
        // класс StringBuilder уведичивает свой размер динамически
        /*перегруженный append добавляет различные типы данных к строке
        * в зависимости от размера добавляемых данных могут изменяться значения
        * length и capacity объекта*/
        sb.append(true);
        sb.append(10);
        sb.append('a');
        sb.append(20.99);
        sb.append("Hi");
        System.out.println(sb);
        System.out.println("| --------------------------------------- |");

        StringBuilder sb1 = new StringBuilder();
        System.out.println("length " + sb1.length());
        System.out.println("capacity " + sb1.capacity());

        for (int i = 0; i < 100; i++) {
            System.out.println("|---------------------------|");
            sb1.append(i).append(" "); // хороший вариант - возвращает ссылку на самого себя
            //sb1.append(i + " ") // происходит конкатенация строк, как следствие начинают плодиться объекты
            System.out.println("length " + sb1.length());
            System.out.println("capacity " + sb1.capacity());
        }
        System.out.println("|-------------------------------|");

        /*Перегруженный метод inset() вставляет различные типы данных в указанную позицию
        * В зависимости от типа добавляемых данных может меняться синтаксис метода
        * Вставка методом insert() приводит к перенумерации символов, ранее хранимых в объекте*/
        StringBuilder sb2 = new StringBuilder("Bon");
        sb2.insert(2, 'r');
        System.out.println(sb2);
        System.out.println("|--------------------------------------|");

        /*Метод delete() удаляет один или несколько символов из объекта StringBuilder
        * Удаление символов приводит к перенумерации элементов объекта
        * Метод deleteCharAt() удаляет единичный символ в указанной позиции*/
        StringBuilder sb3 = new StringBuilder("0123456");
        sb3.delete(2, 4);
        System.out.println(sb3);
        sb3.deleteCharAt(2);
        System.out.println(sb3);
    }
}
