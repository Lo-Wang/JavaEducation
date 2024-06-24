package timus

import java.util.Scanner;

public class 1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
