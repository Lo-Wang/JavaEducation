package lr1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = sc.nextInt();

        int num1 = num - 1;
        int num2 = num;
        int num3 = num + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);

        System.out.println("Последовательность чисел: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);

        sc.close();
    }
    
}
