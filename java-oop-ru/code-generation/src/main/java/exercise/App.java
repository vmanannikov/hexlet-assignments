package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        String json = car.serialize();
        Path fullPath = path.toAbsolutePath().normalize();

        try {
            Files.writeString(fullPath, json, StandardOpenOption.WRITE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car extract(Path path) {
        Path fullPath = Paths.get(path.toString()).toAbsolutePath().normalize();
        Car car = null;
        try {
            car = Car.unserialize(Files.readString(fullPath));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return car;
    }
}
// END
