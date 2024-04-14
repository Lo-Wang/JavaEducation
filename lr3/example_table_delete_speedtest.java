package lr3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class example_table_delete_speedtest {

    public static void main(String[] args) {
        // Тест для ArrayDeque
        System.out.println("Тест для ArrayDeque:");
        testCollection(new ArrayDeque<>());

        // Тест для LinkedList
        System.out.println("\nТест для LinkedList:");
        testCollection(new LinkedList<>());

        // Тест для ArrayList
        System.out.println("\nТест для ArrayList:");
        testCollection(new ArrayList<>());
    }

    public static void testCollection(java.util.Collection<Integer> collection) {
        // Добавление элементов
        for (int i = 0; i < 1000000; i++) {
            collection.add(i);
        }

        // Удаление элементов из начала
        long startTime = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            collection.remove(0);
        }
        long removeStart = System.nanoTime() - startTime;
        System.out.println("Удаление элементов из начала: " + removeStart + " наносекунд");

        // Удаление элементов из середины
        startTime = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            collection.remove(collection.size() / 2);
        }
        long removeMiddle = System.nanoTime() - startTime;
        System.out.println("Удаление элементов из середины: " + removeMiddle + " наносекунд");

        // Удаление элементов из конца
        startTime = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            collection.remove(collection.size() - 1);
        }
        long removeEnd = System.nanoTime() - startTime;
        System.out.println("Удаление элементов из конца: " + removeEnd + " наносекунд");
    }
}

