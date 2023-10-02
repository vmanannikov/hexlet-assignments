package exercise;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// BEGIN
public class App {

    // "added" — ключ отсутствовал в первом массиве, но был добавлен во второй
    // "deleted" — ключ был в первом массиве, но отсутствует во втором
    // "changed" — ключ присутствовал и в первом и во втором массиве, но значения отличаются
    // "unchanged" — ключ присутствовал и в первом и во втором массиве с одинаковыми значениями
    public static Map<String, String> genDiff (Map<String, Object> dict1, Map<String, Object> dict2) {
        Map<String, String> resultMap = new LinkedHashMap<>();

        TreeSet<String> dictKey = new TreeSet<>();
        dictKey.addAll(dict1.keySet());
        dictKey.addAll(dict2.keySet());

        for (String key : dictKey) {
            if (!dict1.containsKey(key) && dict2.containsKey(key)) {
                resultMap.put(key, "added");
            } else if (dict1.containsKey(key) && !dict2.containsKey(key)) {
                resultMap.put(key, "deleted");
            } else if (dict1.containsKey(key) && dict2.containsKey(key)
                        && !dict1.get(key).equals(dict2.get(key))) {
                resultMap.put(key, "changed");
            } else if (dict1.containsKey(key) && dict2.containsKey(key)
                    && dict1.get(key).equals(dict2.get(key))) {
                resultMap.put(key, "unchanged");
            }
        }
        return resultMap;
    }
}
//END
