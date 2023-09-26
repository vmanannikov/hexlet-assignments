package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {

        Map<String, Integer> map = new HashMap<>();

        if (sentence.isEmpty()) {
            return map;
        }

        String[] sentenceArray = sentence.split(" ");

        for(String word : sentenceArray) {
            if(!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder("[");
        sb.append("\n");

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append("  ");
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(entry.getValue());
            sb.append("\n");
        }

        sb.append("]");
        return !map.isEmpty() ? sb.toString() : "{}";
    }
}
//END
