package Java_First_Level_Lecture_3;

public class AppSwitch {

    public static void main(String[] args) {
        String month = "3";

//        switch (month) {
//            case "1":
//            case "3":
//            case "5":
//            case "7":
//            case "8":
//            case "10":
//            case "12":
//                System.out.println("There are 31 days in that month.");
//                break;
//            case "2":
//                System.out.println("There are 28 days in that month.");
//                break;
//            case "4":
//            case "6":
//            case "11":
//                System.out.println("There are 30 days in that month.");
//                break;
//            default:
//                System.out.println("Invalid month.");
//                break;
//        }
//
//        String s = (1 > 2) ? "Yes" : "No";
//        System.out.println((1 > 2) ? "yes" : 2);

        // WHILE
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello Thomas");
//            ++i;
//        }

        //  FOR
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }
//
//        short t = 0;
//        for (;;) {
//            System.out.println(t + t);
//        }

        // DO WHILE
//        do {
//
//        } while ();

        //Вложенные циклы

        // Используйте while для итераций по выражениям 0 и более раз
        // Используйте цикл for для итераций по выражениям заданное количество раз

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j > 6; j++) {
                if (j == 3) {
                    //break; // прерывание цикла
                    //continue; // пропустить и перейти ниже
                    return;
                }
                System.out.print("m" + i + j + " ");
            }
            System.out.println();
        }
    }

}
