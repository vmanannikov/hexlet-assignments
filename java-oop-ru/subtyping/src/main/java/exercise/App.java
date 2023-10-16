package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var entry = storage.toMap().entrySet().stream().
                map(Map.Entry::copyOf).toList();

        for(Map.Entry<String, String> entries : entry) {
            storage.unset(entries.getKey());
            storage.set(entries.getValue(), entries.getKey());
        }
    }
}
// END
