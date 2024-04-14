package lr4;

import java.util.Scanner;

public class table_example3 {
    public static void main(String[] args) {
        try {
            // Ввод размера массива с клавиатуры
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            // Создание массива с заданным размером
            byte[] array = new byte[size];

            // Ввод элементов массива с клавиатуры
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextByte();
            }
            scanner.close();
            // Вычисление суммы элементов массива
            byte sum = calculateSum(array);
            System.out.println("Сумма элементов массива: " + sum);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Введенный размер массива меньше указанного");
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Ошибка: Введенное число не соответствует типу byte");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Ошибка: Произошло переполнение типа byte");
        }
    }

    public static byte calculateSum(byte[] array) {
        byte sum = 0;
        for (byte num : array) {
            // Проверка на переполнение типа byte
            if ((num > 0 && sum > Byte.MAX_VALUE - num) || (num < 0 && sum < Byte.MIN_VALUE - num)) {
                throw new ArithmeticException("Произошло переполнение типа byte");
            }
            sum += num;
        }
        return sum;
    }
}

