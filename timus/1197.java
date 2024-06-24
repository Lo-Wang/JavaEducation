package timus

import java.util.Scanner;

public class 1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String position = scanner.nextLine();
            int x = position.charAt(0) - 'a' + 1;
            int y = position.charAt(1) - '1' + 1;

            int count = 0;

            for (int j = 0; j < 8; j++) {
                int newX = x + dx[j];
                int newY = y + dy[j];

                if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}
