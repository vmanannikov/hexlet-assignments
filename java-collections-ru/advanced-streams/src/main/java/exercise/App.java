package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String variables) {
        //String[] env = variables.split("\n");

        // environment="key5=value5,X_FORWARDED_var3=value,key6=value6"

        String result = Stream.of(variables.split("\n"))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.substring(line.indexOf('"') + 1, line.lastIndexOf('"')))
                .flatMap(line -> Arrays.stream(line.split(",")))
                .filter(key -> key.startsWith("X_FORWARDED_"))
                .map(key -> key.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
        return result;
    }
}
//END
