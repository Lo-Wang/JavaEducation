package lr1;

import java.time.Year;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год рождения:");
        int birthYear = sc.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет");

        sc.close();
    }
    
}