package Java_First_Level_Lecture_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrowException {

    // Повторный отлов исключений
    FileInputStream myfile;
    public void myMethod() throws FileNotFoundException {
        try {
            myfile = new FileInputStream("soccer.txt");
        } catch (FileNotFoundException fe) {
            throw fe;
        }
    }
}
