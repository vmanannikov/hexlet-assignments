package exercise;

import jdk.jshell.execution.Util;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    String filePath;
    Map<String, String> map;

    public FileKV(String filePath, Map<String, String> map) {
        this.filePath = filePath;
        this.map = map;
        Utils.writeFile(filePath, Utils.serialize(map));
    }

    @Override
    public void set(String key, String value) {
        var map = Utils.unserialize(Utils.readFile(this.filePath));
        map.put(key, value);
        Utils.writeFile(this.filePath, Utils.serialize(map));
    }

    @Override
    public void unset(String key) {
        var map = Utils.unserialize(Utils.readFile(this.filePath));
        map.remove(key);
        Utils.writeFile(this.filePath, Utils.serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        var map = Utils.unserialize(Utils.readFile(this.filePath));
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}
// END
