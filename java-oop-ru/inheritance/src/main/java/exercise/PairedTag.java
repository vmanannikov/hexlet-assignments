package exercise;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attr, String body, List<Tag> children) {
        super(name, attr);
        this.body = body;
        this.children = children;
    }

    private String getBodyOrEmpty(String body) {
        return body.isEmpty() ? "" : this.body;
    }

    private String getChildTag(List<Tag> singleTag) {
        StringBuilder sb = new StringBuilder();
        for(Tag tag : singleTag) {
            sb.append(tag.toString());
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return getAttr().entrySet().stream()
                .map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" ", "<"
                        + getName() + (getAttr().isEmpty() ? "" : " "), ">"
                        + getBodyOrEmpty(body)
                        + getChildTag(children)
                        + "</" + getName() + ">"));
    }
}
// END
