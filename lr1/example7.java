package lr1;

import java.time.Year;
import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = sc.nextInt();

        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        sc.close();
    }
    
}
