package lr1;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        
        System.out.print("Введите возраст: ");
        byte age = Byte.parseByte(sc.nextLine());
        
        System.out.printf("Имя пользователя - " +  name + "\nВозраст пользователя - " + age);
        sc.close();
    }
    
}
