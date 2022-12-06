package Java_First_Level_Lecture_9.HumanExcep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppEx {

    public static void main(String[] args) {

        HumanEx vasya = createHumanConsole();
        System.out.println(vasya);
    }

    private static HumanEx createHumanConsole() {
        HumanEx humanEx = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(new UbclosedStrim(System.in)));
        try {
            System.out.println("Input human's name");
            String name = br.readLine();
            System.out.println("Input Human's age");
            int age = readNumber(br);
            while (humanEx == null) {
                try {
                    humanEx = new HumanEx(name, age);
                } catch (HumanNameException e) {
                    System.out.println(e.getLocalizedMessage());
                    System.out.println("Input human's name");
                    name = br.readLine();
                } catch (HumanAgeException e) {
                    System.out.println(e.getLocalizedMessage());
                    System.out.println("Input Human's age");
                    age = readNumber(br);
                } finally {
                    br.close();
                }
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

        return humanEx;
    }

    public static int readNumber(BufferedReader br) throws IOException {

        while (true) {
            try {
                return Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }
    }


}
