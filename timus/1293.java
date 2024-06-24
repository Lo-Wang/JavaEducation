package timus

import java.util.Scanner;

public class 1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        System.out.print(N*(A*B*2));
    }
}
