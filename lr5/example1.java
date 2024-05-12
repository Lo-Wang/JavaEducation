package lr5;

import java.util.ArrayList;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
        // Пример использования функции filterEvenNumbers
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = filterEvenNumbers(inputArray);
        System.out.println("Четные числа из исходного массива:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] filterEvenNumbers(int[] arr) {
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbersList.add(num);
            }
        }

        // Преобразование списка обратно в массив
        int[] evenNumbersArray = new int[evenNumbersList.size()];
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenNumbersArray[i] = evenNumbersList.get(i);
        }
        return evenNumbersArray;
    }
}

