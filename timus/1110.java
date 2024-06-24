package timus

import java.util.*;

public class 1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        
        List<Integer> results = new ArrayList<>();
        
        for (int X = 0; X < M; X++) {
            if (modularExponentiation(X, N, M) == Y) {
                results.add(X);
            }
        }
        
        if (results.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < results.size(); i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(results.get(i));
            }
            System.out.println();
        }
    }
    
    private static int modularExponentiation(int X, int N, int M) {
        if (N == 0) {
            return 1 % M;
        }
        
        long result = 1;
        long base = X % M;
        
        while (N > 0) {
            if (N % 2 == 1) {
                result = (result * base) % M;
            }
            base = (base * base) % M;
            N /= 2;
        }
        
        return (int) result;
    }
}
