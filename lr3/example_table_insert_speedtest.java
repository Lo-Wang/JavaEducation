package lr3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class example_table_insert_speedtest {

    public static void main(String[] args) {
        // Тест для ArrayDeque
        System.out.println("Тест для ArrayDeque:");
        testCollectionAdd(new ArrayDeque<>());

        // Тест для LinkedList
        System.out.println("\nТест для LinkedList:");
        testCollectionAdd(new LinkedList<>());

        // Тест для ArrayList
        System.out.println("\nТест для ArrayList:");
        testCollectionAdd(new ArrayList<>());
    }

    public static void testCollectionAdd(List<Integer> list) {
        // Добавление элементов в начало
        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list.add(0, i);
        }
        long addStart = System.nanoTime() - startTime;
        System.out.println("Добавление элементов в начало: " + addStart + " наносекунд");

        // Добавление элементов в середину
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list.add(list.size() / 2, i);
        }
        long addMiddle = System.nanoTime() - startTime;
        System.out.println("Добавление элементов в середину: " + addMiddle + " наносекунд");

        // Добавление элементов в конец
        startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list.add(i);
        }
        long addEnd = System.nanoTime() - startTime;
        System.out.println("Добавление элементов в конец: " + addEnd + " наносекунд");
    }
}


