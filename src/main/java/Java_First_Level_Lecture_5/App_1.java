package Java_First_Level_Lecture_5;

import java.lang.reflect.Field;

public class App_1 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        A a2 = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        A a3 = new A();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        A.class.getFields(); // Покажет все поля и их описания
        //создать массив филдов (полей) и пройтись поним циклом
        Field[] fields = A.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

    }
}

class A {
    public B notStaticField1 = new B("notStaticField1");
    public static B staticField1 = new B("StaticField1");

    {
        System.out.println("Init block");
    }

    static {
        System.out.println("Static Init block");
    }

    public A() {
        System.out.println("constructor");
    }

    public B notStaticField2 = new B("notStaticField");
    public static B staticField2 = new B("StaticField");

}

class B {
    public B(String s) {
        System.out.println(s);
    }
}
