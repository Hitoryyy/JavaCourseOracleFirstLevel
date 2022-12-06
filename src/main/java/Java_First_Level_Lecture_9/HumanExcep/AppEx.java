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
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input human's name");
            String name = br.readLine();
            System.out.println("Input Human's age");
            int age = Integer.parseInt(br.readLine());
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
                    age = Integer.parseInt(br.readLine());
                }
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }

        return humanEx;
    }
}
