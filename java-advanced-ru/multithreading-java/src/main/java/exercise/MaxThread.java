package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// BEGIN
public class MaxThread extends Thread {
    private List<Integer> numbers;
    private OptionalInt max;

    public MaxThread (int[] nums) {
        this.numbers = Arrays.stream(nums).boxed().toList();
    }

    @Override
    public void run() {
        max = numbers.stream()
                .mapToInt(v -> v)
                .max();
    }

    public int getMax() {
        return max.getAsInt();
    }
}
// END
