package timus

import java.util.Scanner;

public class 2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        scanner.close();

        int totalTasks = 12;

        int remainingTasks = totalTasks - f;

        int maxTasksInRemainingTime = 240 / 45;

        if (remainingTasks <= maxTasksInRemainingTime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
