package timus

import java.util.Scanner;

public class 1263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Читаем число кандидатов (N) и число избирателей (M)
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // Создаем массив для подсчета голосов за каждого кандидата
        int[] votes = new int[N + 1]; // Индексы от 1 до N
        
        // Читаем голоса избирателей
        for (int i = 0; i < M; i++) {
            int candidate = scanner.nextInt();
            votes[candidate]++;
        }
        
        // Выводим процент голосов за каждого кандидата
        for (int i = 1; i <= N; i++) {
            double percentage = (double) votes[i] / M * 100.0;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
