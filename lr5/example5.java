package lr5;

import java.util.ArrayList;
import java.util.List;

public class example5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        List<String> filteredList = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
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

        String substring = "an";

        List<String> filteredStrings = filterStrings(strings, substring);
        System.out.println("Filtered strings: " + filteredStrings);
    }
}

