package exercise;

import java.util.List;
import java.util.function.Predicate;


// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emailList) {
        Predicate<String> mailDomen = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("@gmail.com")
                        || s.contains("@yandex.ru")
                        || s.contains("@hotmail.com");
            }
        };

        return (int) emailList.stream()
                .filter(mailDomen)
                .count();
    }
}
// END
