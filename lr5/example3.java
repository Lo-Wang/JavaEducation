package lr5;

import java.util.ArrayList;
import java.util.List;

public class example3 {
    public static void main(String[] args) {
        // Пример использования функции filterCapitalizedStrings
        List<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("banana");
        inputList.add("Orange");
        inputList.add("grape");
        
        List<String> capitalizedStrings = filterCapitalizedStrings(inputList);
        System.out.println("Строки, начинающиеся с большой буквы:");
        for (String str : capitalizedStrings) {
            System.out.println(str);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> strList) {
        List<String> result = new ArrayList<>();
        for (String str : strList) {
            if (Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }
}

