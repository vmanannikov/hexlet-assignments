package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> map) {
        List<Map<String, String>> books = new ArrayList<>();

        for (Map<String, String> listMap : list) {
            if (listMap.entrySet().containsAll(map.entrySet())) {
                books.add(listMap);
            }
        }
        return books;
    }
}
//END
