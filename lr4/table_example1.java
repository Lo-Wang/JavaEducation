package lr4;

import java.util.Scanner;

public class table_example1 {
    public static void main(String[] args) {
        try {
            // Ввод массива с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите элементы массива через пробел: ");
            String[] input = scanner.nextLine().split(" ");
            scanner.close();    
            int[] numbers = new int[input.length];

            // Преобразование строк в целые числа
            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            // Вычисление среднего значения положительных элементов
            double average = calculatePositiveAverage(numbers);
            System.out.println("Среднее значение среди положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите числовые значения");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Введите как минимум одно число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static double calculatePositiveAverage(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Положительные элементы отсутствуют");
        }

        return (double) sum / count;
    }
}
