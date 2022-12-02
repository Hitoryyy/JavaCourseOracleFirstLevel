package Java_First_Level_Lecture_8;

import java.util.Comparator;

public class ClothComparator implements Comparator<Clothing> {

    @Override
    public int compare(Clothing o1, Clothing o2) {

        return o1.getSize() - o2.getSize();
    }
}
