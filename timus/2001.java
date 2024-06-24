package timus

import java.util.Scanner;

public class 2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем входные данные
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        
        // Находим массы ягод каждого математика
        int x = a1 - a3; // x + y = a1, y = a3
        int y = b1 - b2; // x + y = b1, x = b2
        
        // Выводим результат
        System.out.println(x + " " + y);
    }
}
