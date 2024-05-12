package lr5;

import java.util.HashSet;
import java.util.Set;

public class example2 {
    public static void main(String[] args) {
        // Пример использования функции intersectArrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] intersection = intersectArrays(array1, array2);
        System.out.println("Элементы, которые есть в обоих массивах:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersectArrays(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Преобразование множества в массив
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index++] = num;
        }
        return intersectionArray;
    }
}

