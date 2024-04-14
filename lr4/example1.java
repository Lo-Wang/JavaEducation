package lr4;

public class example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
            return; // Добавлен оператор return для завершения программы после обработки исключения
        }
        // Этот код не будет достигнут, поэтому его можно удалить
        // System.out.println("2");
    }
    
}


