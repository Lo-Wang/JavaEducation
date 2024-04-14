package lr3;

import java.util.Scanner;

public class example2 {
    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        } else {
            return toBinary(n / 2) + (n % 2 == 0 ? "0" : "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для перевода в двоичную систему:");
        int number = sc.nextInt();
        System.out.println("Число в двоичной системе: " + toBinary(number));
        sc.close();
    }
    
}
