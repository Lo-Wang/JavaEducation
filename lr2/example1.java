package lr2;

import java.util.Arrays;
import java.util.Random;

public class example1 {
    public static void main(String[] args) {
        // Создание массива и заполнение случайными числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Вывод массива в консоль
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Определение элемента с минимальным значением и его индексы
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Вывод результатов
        System.out.println("\nМинимальное значение в массиве: " + min);
        System.out.print("Индексы минимальных элементов: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}

