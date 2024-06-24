package timus

import java.util.Scanner;

public class 1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        
        int[] cars = new int[n];
        for (int i = 0; i < n; i++) {
            cars[i] = scanner.nextInt();
        }
        scanner.close();

        int queue = 0;
        
        for (int i = 0; i < n; i++) {
            queue += cars[i];
            if (queue > k) {
                queue -= k;
            } else {
                queue = 0;
            }
        }
        
        System.out.println(queue);
    }
}
