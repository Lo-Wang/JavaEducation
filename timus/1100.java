package timus

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Чтение количества команд
        int N = Integer.parseInt(reader.readLine());
        int[][] teams = new int[N][3];

        // Чтение данных команд
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            teams[i][0] = Integer.parseInt(input[0]); // ID
            teams[i][1] = Integer.parseInt(input[1]); // Solved
            teams[i][2] = i; 
        }
        
        reader.close();

        // Сортировка команд по количеству решённых задач (по убыванию), а затем по индексу
        Arrays.sort(teams, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[1] != a[1]) {
                    return b[1] - a[1];
                } else {
                    return a[2] - b[2];
                }
            }
        });

        // Вывод отсортированных данных
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < N; i++) {
            output.append(teams[i][0]).append(" ").append(teams[i][1]).append("\n");
        }
        System.out.print(output);
    }
}
