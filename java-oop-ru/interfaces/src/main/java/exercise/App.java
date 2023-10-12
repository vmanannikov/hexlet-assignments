package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> home, int number) {
        return home.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .limit(number)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END
