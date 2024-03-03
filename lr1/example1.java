package lr1;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String surname = sc.nextLine();
        
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        
        System.out.print("Введите отчество: ");
        String patronymic = sc.nextLine();
        
        System.out.printf("Hello, " + surname + name + patronymic);
        sc.close();
    }
    
}
