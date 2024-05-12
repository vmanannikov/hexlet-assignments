package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

// BEGIN
public class MinThread extends Thread {
    private List<Integer> numbers;
    private OptionalInt min;

    public MinThread (int[] nums) {
        this.numbers = Arrays.stream(nums).boxed().toList();
    }

    @Override
    public void run() {
        min = numbers.stream()
                .mapToInt(v -> v)
                .min();
    }

    public int getMin() {
        return min.getAsInt();
    }
}
// END
