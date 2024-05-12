package lr5;

import java.util.ArrayList;
import java.util.List;

public class example6 {
    public static List<Integer> filterNumbers(List<Integer> numbers, int divisor) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : numbers) {
            if (number % divisor == 0) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(14);
        numbers.add(20);
        numbers.add(21);
        numbers.add(30);

        int divisor = 5;

        List<Integer> filteredNumbers = filterNumbers(numbers, divisor);
        System.out.println("Filtered numbers: " + filteredNumbers);
    }
}

