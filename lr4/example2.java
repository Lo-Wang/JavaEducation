package lr4;

public class example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            // Если бы тут был блок с выводом в консоль 1, то был бы недостижимый код и ошибка
        } catch (Exception e) {
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }    
}
