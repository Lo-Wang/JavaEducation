package lr5;

import java.util.ArrayList;
import java.util.List;

public class example10 {
    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int threshold) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : numbers) {
            if (number < threshold) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        int threshold = 25;

        List<Integer> filteredNumbers = filterNumbersLessThan(numbers, threshold);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}

