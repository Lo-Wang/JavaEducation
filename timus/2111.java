package timus

import java.util.Scanner;

public class 2111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] distances = new int[n];
        long sumOfDistances = 0;

        for (int i = 0; i < n; i++) {
            distances[i] = scanner.nextInt();
            sumOfDistances += distances[i];
        }

        long minTax = sumOfDistances * sumOfDistances;

        System.out.println(minTax);
    }
}
