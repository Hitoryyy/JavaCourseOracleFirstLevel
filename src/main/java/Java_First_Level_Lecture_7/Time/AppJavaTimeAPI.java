package Java_First_Level_Lecture_7.Time;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class AppJavaTimeAPI {

    /*Пакет для работы с датами и временем
    * основные классы:
    * LocalDate
    * LocalTime
    * LocalDateTime
    * все конструкторы - приватные*/

    public static void main(String[] args) {
        // создаём объект класса LocalDateTime и активируем на нём метод now(),
        // который хранит текущее время и дату
        LocalDateTime ldt = LocalDateTime.now();
        String s = ldt.toString();
        System.out.println(ldt);

        //есть возможность форматировать вывод
        //через метод format - возвращает строку
        /*Для представления даты в отличном от стандартного формате нужно
        * воспользоваться методом format.
        * String format(DateFormatter formatterObject)
        * Класс DateTimeFormatter входит в пакет java.time.format.
        * Для получения экземпляра класса DateTimeFormatter,
        * используют один из фабричных методов:
        * static DateTimeFormatter ofLocalizedDate(ForinatStyle dateStyle)
        * static DateTimeFormatter ofLocalizedDate(ForinatStyle timeStyle)
        * static DateTimeFormatter ofLocalizedDate(ForinatStyle dateStyle) или
        * (ForinatStyle dateStyle, ForinatStyle timeStyle)
        * Перечисление FormatStyle входит в пакет java.time.format.
        * В нём определены такие константы: FULL, LONG, MEDIUM, SHORT
        * Они обозначают уровень детализации даты и времени.*/

        // Пример:
        FormatStyle dateStyle = FormatStyle.LONG;
        FormatStyle timeStyle = FormatStyle.SHORT;
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle);
        String localDate = ldt.format(formatter);
        System.out.println(localDate);
        System.out.println("|----------------------|");

        /*Для задания пользовательского формата отображения даты и времени
        * используется фабричный метод ofPattern(String patern)
        * из класса DateTimeFormatter.
        * Здесь параметр patern, обозначает шаблон даты и времени,
        * состоящий из спецификаторов формата (букв шаблона).*/

        // Пример:
        String pattern = "dd MMMM yyyy EEEE H':'m':'s";
        formatter = DateTimeFormatter.ofPattern(pattern, Locale.UK);
        localDate = ldt.format(formatter);
        System.out.println(localDate);

        /*При помощи статистического метода parse(CharSequence text) из
        * классов LocalDate, LocalTime и LocalDateTime можно парсить
        * символьные строки (text) в соответствующие объекты.
        * Строка, содержащая дату и время, должна быть задана в надлежащем формате.
        * Если же указан недействительный формат, возникнет ошибка.
        *
        * Если требуется распарсить строки даты и/или времени в другом формате,
        * то можно воспользоваться второй формой данного метода,
        * позволяющей указать собственный формат.
        * static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)*/

        ldt = LocalDateTime.parse(s);
        System.out.println(ldt);
    }
}
