package lr5;

import java.util.ArrayList;
import java.util.List;

public class example4 {
    public static List<Integer> squareList(List<Integer> numbers) {
        List<Integer> squaredList = new ArrayList<>();
        for (int number : numbers) {
            squaredList.add(number * number);
        }
        return squaredList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> squaredNumbers = squareList(numbers);
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
