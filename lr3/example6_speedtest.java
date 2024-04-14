package lr3;
import java.util.ArrayList;
import java.util.LinkedList;

public class example6_speedtest {
    public static void main(String[] args) {
        int N = 10000; // Количество человек в кругу
        long startTime;
        long endTime;

        // Используем ArrayList
        ArrayList<Integer> circleArrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            circleArrayList.add(i);
        }
        startTime = System.currentTimeMillis();
        simulateCircleGameArrayList(circleArrayList);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList: Время выполнения: " + (endTime - startTime) + " миллисекунд");

        // Используем LinkedList
        LinkedList<Integer> circleLinkedList = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            circleLinkedList.add(i);
        }
        startTime = System.currentTimeMillis();
        simulateCircleGameLinkedList(circleLinkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList: Время выполнения: " + (endTime - startTime) + " миллисекунд");
    }

    public static void simulateCircleGameArrayList(ArrayList<Integer> circle) {
        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }
    }

    public static void simulateCircleGameLinkedList(LinkedList<Integer> circle) {
        int currentIndex = 0;
        while (circle.size() > 1) {
            currentIndex = (currentIndex + 1) % circle.size();
            circle.remove(currentIndex);
        }
    }
}


