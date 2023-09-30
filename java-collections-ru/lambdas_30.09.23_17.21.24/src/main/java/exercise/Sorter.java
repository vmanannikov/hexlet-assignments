package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .flatMap(s -> s.entrySet().stream())
                .forEach(e -> {
                    e.getValue();
                });
    }
}
// END
