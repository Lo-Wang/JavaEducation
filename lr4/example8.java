package lr4;

public class example8 {
    public static void m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            m(); // Ловим исключение и продолжаем работу программы
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After m()");
    }
}


