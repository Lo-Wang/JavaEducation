package timus

import java.util.Scanner;

public class 1264 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        // Парсим входные данные N и M
        String[] tokens = input.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);

        // Вычисляем количество секунд, требуемых Петечкину на написание функции
        long timeInSeconds = (long) N * (M + 1);

        // Выводим результат
        System.out.println(timeInSeconds);
    }
}
