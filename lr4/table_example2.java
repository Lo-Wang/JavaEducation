package lr4;

import java.util.Scanner;

public class table_example2 {
    public static void main(String[] args) {
        try {
            // Ввод номера столбца с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер столбца: ");
            int columnNumber = scanner.nextInt();

            // Ввод матрицы с клавиатуры
            System.out.print("Введите количество строк: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов: ");
            int columns = scanner.nextInt();
            int[][] matrix = new int[rows][columns];

            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            scanner.close();
            // Вывод столбца с указанным номером
            printColumn(matrix, columnNumber);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Нет столбца с таким номером");
        }
    }

    public static void printColumn(int[][] matrix, int columnNumber) {
        for (int i = 0; i < matrix.length; i++) {
            if (columnNumber >= matrix[i].length) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером");
            }
            System.out.println(matrix[i][columnNumber]);
        }
    }
}
