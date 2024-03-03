package lr1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = sc.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;

        System.out.println("Сумма чисел: " + sum);

        sc.close();
    }
    
}
