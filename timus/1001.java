package timus

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        
        while (scanner.hasNextDouble()) {
            numbers.add(scanner.nextDouble());
        }
        
        Collections.reverse(numbers);
        
        for (double number : numbers) {
            System.out.printf("%.4f\n", Math.sqrt(number));
        }
        
        scanner.close();
    }
}
