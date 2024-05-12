package lr5;

import java.util.ArrayList;
import java.util.List;

public class example9 {
    public static List<String> filterStringsOnlyLetters(List<String> strings) {
        List<String> filteredList = new ArrayList<>();
        for (String str : strings) {
            if (str.matches("[a-zA-Z]+")) {
                filteredList.add(str);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana123");
        strings.add("orange");
        strings.add("grape456");
        strings.add("watermelon");

        List<String> filteredStrings = filterStringsOnlyLetters(strings);
        System.out.println("Filtered strings: " + filteredStrings);
    }
}

