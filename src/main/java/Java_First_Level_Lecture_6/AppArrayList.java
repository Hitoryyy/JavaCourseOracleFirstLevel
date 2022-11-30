package Java_First_Level_Lecture_6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import Java_First_Level_Lecture_5.Human;



public class AppArrayList {
    public static void main(String[] args) {

        // объявляем сылочную переменную myStringList
        // типа ArrayList<String> (строковый аррейлист)
        // создаём объект в хипе (heap) ArrayList
        ArrayList<String> myStringList = new ArrayList<>();
        // <> - дженерик (параметризация) - не попадает в байт-код

        ArrayList<String> stringList = new ArrayList<>();

        // для быстродействия сразу задаём размер массива, который лежит
        // в ArrayList
        ArrayList<Human> humanList = new ArrayList<>(10);

        // метод add является перегруженным, можно указываеть индекс куда нужно
        // положить элемент, если на этом месте уже что-то лежит, то оно сдвинется
        // на следующий и т.д.
        // если не указывать индекс элемент вставится в конец
        // но нельзя добавлять элементы не подряд - либо в занятый, либо в пустой
        humanList.add(new Human("Vasya", 25));
        humanList.add(0, new Human("Kolya", 33));
        humanList.add(new Human("Masha", 30));

        System.out.println(humanList.get(1));

        for (Human human : humanList) {
            human.voice();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        // сырой ArrayList - можно положить любой тип, т.к. не параметризации,
        // контроля, который задаётся дженериком
        ArrayList humanListRow = new ArrayList<>();
        humanListRow.add(new Human("Vasya", 25));
        humanListRow.add(0, new Human("Kolya", 33));
        humanListRow.add(new Human("Masha", 30));
        humanListRow.add("Masha");

        for (Object object : humanListRow) {
            if (object instanceof Human) { // проверка на приведение к типу
                                            // тоесть метод .voice()
                                            // применится только к элементам, которые
                                            // относятся к типу Human
                                            // к строке "Masha" - нет
                ((Human)object).voice(); // приведение к типу Human
                // на этапе компиляции всё ок
                // ошибка будет на выходе
            }
        }

        System.out.println(humanList.size()); // показывает текущий размер Arraylist
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        //humanListRow.trimToSize(); // подгон массива под текущее кол-во эл.
        // что бы массив не кушал память, т.к. автоматически он только расширяется,
        // но не уменьшается в случае удаления элементов


    }
}
