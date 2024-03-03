package lr1;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayofweek = sc.nextLine();
        
        System.out.print("Введите название месяца: ");
        String nameofmonth = sc.nextLine();

        System.out.print("Введите текущее число: ");
        byte numberofday = Byte.parseByte(sc.nextLine());
        
        System.out.printf("Сегодня - " + dayofweek + ", " + numberofday + " - " + nameofmonth);
        sc.close();
    }
    
}
