package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    String value;
    TagInterface tagInterface;

    public LabelTag(String value, TagInterface tagInterface) {
        this.value = value;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        return "<label>" + value + tagInterface.render() + "</label>";
    }
}
// END
