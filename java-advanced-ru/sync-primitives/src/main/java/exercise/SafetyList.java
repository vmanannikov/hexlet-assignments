package exercise;

import java.util.ArrayList;
import java.util.List;

public class SafetyList {
    // BEGIN
    private List data;

    public SafetyList() {
        this.data = new ArrayList<Integer>();
    }

    public int getSize() {
        return data.size();
    }

    public int get(int index) {
        return (int) data.get(index);
    }

    public synchronized void add(int element) {
        this.data.add(element);
    }
    // END
}
