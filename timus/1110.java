import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        String output = "";
        
        for (int x = 0; x <= b2; x++) {
            if (Math.pow(x, a1) % b2 == c3) {
                output += x + " ";
            }
        }
        if (output != ""){
            output.trim();
            System.out.println(output);
        }
        else{
            System.out.println(-1);
        }
        
        scanner.close();
    }
}
