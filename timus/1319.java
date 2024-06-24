package timus

import java.util.Scanner;

public class 1319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[][] table = new int[N][N];
        
        int number = 1;
        
        // Заполняем таблицу
        int row = 0, col = N - 1; // Начинаем с правого верхнего угла
        
        while (number <= N * N) {
            // Двигаемся вниз по диагонали
            int r = row, c = col;
            while (r < N && c < N) {
                table[r][c] = number++;
                r++;
                c++;
            }
            
            if (col > 0) {
                col--; // Переходим на следующую диагональ влево
            } else {
                row++; // Переходим на следующую диагональ вниз
            }
        }
        
        // Выводим таблицу
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
