package lr5;

import java.util.ArrayList;
import java.util.List;

public class example8 {
    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int threshold) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : numbers) {
            if (number > threshold) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(21);
        numbers.add(25);
        numbers.add(30);

        int threshold = 20;

        List<Integer> filteredNumbers = filterNumbersGreaterThan(numbers, threshold);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}

