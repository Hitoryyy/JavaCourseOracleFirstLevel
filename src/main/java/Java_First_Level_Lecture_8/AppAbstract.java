package Java_First_Level_Lecture_8;

public class AppAbstract {
    // Абстрактный класс
    /*Абстрактный класс - это Java-класс, объявленный как абстрактный, т.е.
    * при объявлении такого класса использован модификатор abstract.
    * Из абстрактного класса нельзя создать объект, но можно на его основе
    * создать подкласс.
    * Абстрактный класс может содержать или не содержать абстрактные
    * методы*/
}
abstract class MY1 { // пример
    // если абстрактный класс содержит абстрактные методы - он должен быть
    // абстрактным, но абстрактный класс не обязан содержать абстрактные методы
    abstract String myMethod(int a);

    static public void main(String[] args) {
        int i = 10;
        System.out.println(i == i++);
    }
}
// Абстрактный метод
/*Абстрактный метод - это метод который объявлен без реализации (т.е. нет
фигурных скобок после объявления метода)
*Если класс содержит абстрактные методы, то он должен быть объявлен абстрактным.
 Если создаётся подкласс из абстрактного класса, то подкласс должен:
    - Или реализовывать все абстрактные методы суперкласса;
    - Или тоже быть абстрактным.*/

// Ещё пример
// Класс родитель
abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {

    }

    abstract void draw();
    abstract void resize();
}

//  Классы потомоки
class Circle extends GraphicObject {
    // переопределяются методы родителя
    @Override
    void draw(){
        // ...
    }

    @Override
    void resize(){
        // ...
    }
}

class Rectangle extends GraphicObject {
    @Override
    void draw() {
        // ...
    }

    @Override
    void resize() {
        // ...
    }
}