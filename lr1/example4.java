package lr1;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String nameofmonth = sc.nextLine();
        
        System.out.print("Введите колличество дней: ");
        byte amountdays = Byte.parseByte(sc.nextLine());
        
        System.out.printf("В месяце " + nameofmonth + " " + amountdays + " дней");
        sc.close();
    }
    
}
