package timus

import java.math.BigInteger;
import java.util.Scanner;

public class 1243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger N = scanner.nextBigInteger();
        

        BigInteger seven = BigInteger.valueOf(7);
        BigInteger belosnezhkaShare = N.mod(seven);
        
        System.out.println(belosnezhkaShare);
    }
}
