package lr3;

import java.util.*;

public class example_table_search_speedtest{

    public static void main(String[] args) {
        // Тест для ArrayDeque
        System.out.println("Тест для ArrayDeque:");
        testCollectionSearch(new ArrayDeque<>());

        // Тест для LinkedList
        System.out.println("\nТест для LinkedList:");
        testCollectionSearch(new java.util.LinkedList<>());

        // Тест для ArrayList
        System.out.println("\nТест для ArrayList:");
        testCollectionSearch(new ArrayList<>());
    }

    public static void testCollectionSearch(Collection<Integer> collection) {
        // Заполнение коллекции элементами
        for (int i = 0; i < 100000; i++) {
            collection.add(i);
        }

        // Поиск элемента в коллекции
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            collection.contains(i);
        }
        long searchTime = System.nanoTime() - startTime;
        System.out.println("Поиск элементов: " + searchTime + " наносекунд");
    }
}

