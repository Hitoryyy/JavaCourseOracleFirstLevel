package Java_First_Level_Lecture_8;

import java.lang.ref.Cleaner;

public class Laundry {

    // все объекты, которые реализую интерфейс клинейбл можно чистить
    public void clean(Cleanable thing, int temp) {
        thing.doClean(temp);
    }
}
