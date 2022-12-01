package Java_First_Level_Lecture_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppReadFile {

    public static void main(String[] args) throws IOException {
        /*  Создаём буфер ридер для чтения байтового потока
        * в нём класс файл ридер для чтения файлов и указываем абсолютный или относительный путь*/
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProjects\\JavaCourseOracleFirstLevel\\src\\main\\java\\Java_First_Level_Lecture_7\\Text"));
        System.out.println(br.readLine());

        /*В примере выше читается только одна строка.
        * создаём объект класса стрингбилдер, пустую строку
        * в цикле: присваиваем пустой строке значени читаемые объектом буферед ридер
        * не равные пустоте
        * в объект стрингбилдер добавляем переход коретки */
        StringBuilder sb = new StringBuilder();
        String s = null;
        while ((s = br.readLine()) != null) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
