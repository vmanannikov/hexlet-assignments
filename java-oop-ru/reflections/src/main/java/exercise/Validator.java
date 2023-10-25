package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        List<String> result = new ArrayList<>();
        Field[] fields = object.getClass().getDeclaredFields();

        for(Field field : fields) {
            field.setAccessible(true);
            try {
                if(field.isAnnotationPresent(NotNull.class) && field.get(object) == null){
                    result.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
    public static Map<String, List<String>> advancedValidate(Object object) {
        Map<String, List<String>> resultMap = new HashMap<>();
        List<String> errors = new ArrayList<>();
        Field[] fields = object.getClass().getDeclaredFields();

        final int MIN_LENGTH = 4;

        for(Field field : fields) {
            field.setAccessible(true);
            try {
                if(field.isAnnotationPresent(NotNull.class) && field.get(object) == null){
                    resultMap.put(field.getName(), Arrays.asList("can not be null"));
                }

                if(field.isAnnotationPresent(MinLength.class) && field.get(object).toString().length() < MIN_LENGTH){
                    resultMap.put(field.getName(), Arrays.asList("length less than 4"));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return resultMap;
    }
}
// END
