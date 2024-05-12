package lr5;

import java.util.ArrayList;
import java.util.List;

public class example7 {
    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> filteredList = new ArrayList<>();
        for (String str : strings) {
            if (str.length() > minLength) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("watermelon");

        int minLength = 6;

        List<String> filteredStrings = filterStringsByLength(strings, minLength);
        System.out.println("Filtered strings: " + filteredStrings);
    }
}

