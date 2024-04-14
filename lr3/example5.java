package lr3;

import java.util.HashMap;
import java.util.Map;

public class example5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Заполнение HashMap
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "девять");
        map.put(10, "десять");

        // Нахождение строк у которых ключ > 5
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Вывод строк через запятую, если ключ = 0
        if (map.containsKey(0)) {
            System.out.println(map.get(0));
        }

        // Перемножение всех ключей, где длина строки > 5
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                result *= entry.getKey();
            }
        }
        System.out.println(result);
    }
}