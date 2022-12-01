package Java_First_Level_Lecture_7;

public class AppExtends {

    public static void main(String[] args) {

        Shirt myRedShirt = new Shirt("Red shirt", 25, 250, 'R');
        System.out.println(myRedShirt);

        C c = new C();

        System.out.println(c.a); // обращение к классу А через С
        System.out.println(((B)c).a); // объект с рассматривается как В
        System.out.println(((A)c).a); // объект с рассматривается как А

        myRedShirt.wash();
        System.out.println(myRedShirt);

        Object o = new B(); // проверка сравнимости объектов
        System.out.println(o instanceof A);
        System.out.println(o instanceof B);
        System.out.println(o instanceof C);

        // C c1 = (C)o; Exception
    }
}

class A {
    int a = 10;
    public A() {
        System.out.println("A()");
    }

}
// Механизм работы наследования на примере иерархии классов А,В,С:
/* В класс С вызывается конструктор родителя без аргументов
* в классе В первой командой вызывается другой конструктор класса В
* с интовыми аргументом, этот конструктор первой инструкцией вызывает конструктор
* родителя А без аргумента, конструктор А вызывает своего родителя (этот никак не видно)
*  далее класс А печатает: ("B()"), завершает свою работу и возвращается туда - откуда он
* был вызван - в класс В, печатается: ("B(int i)"), после печати этот конструктор завершает свою работу
* и передаёт управление потоком туда откуда его вызвали тоесть в конструктор В, далее В
* вызывает метод println и выводит ("B()"), завершает работу и возвращает управление туда
* откуда он был вызван - класс С, далее конструктор С получает управление потоком
* и выводит: ("C()") */
class B extends A {
    int a = 15;
    public B() {
        this(5);
        System.out.println("B()");
    }
    public B(int i) {
        System.out.println("B(int i)");
    }
}

class C extends B {
    int a = 20;
    public C() {
        System.out.println("C()");
    }
}
