package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private Map<String, String> attr;

    public Tag(String name, Map<String, String> attr) {
        this.name = name;
        this.attr = attr;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAttr() {
        return attr;
    }

    public String toString() {
        return attr.entrySet().stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" ", "<" + name + (attr.isEmpty() ? "" : " "), ">"));
    }
}
// END
