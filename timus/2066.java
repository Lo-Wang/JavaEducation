package timus

import java.util.Scanner;

public class 2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        

        int result1 = a + b + c;
        int result2 = a + b - c;
        int result3 = a + b * c;
        int result4 = a - b + c;
        int result5 = a - b - c;
        int result6 = a - b * c;
        int result7 = a * b + c;
        int result8 = a * b - c;
        int result9 = a * b * c;
        
        int minValue = Math.min(result1, Math.min(result2, Math.min(result3, Math.min(result4, 
                        Math.min(result5, Math.min(result6, Math.min(result7, Math.min(result8, result9))))))));
        
        System.out.println(minValue);
    }
}
