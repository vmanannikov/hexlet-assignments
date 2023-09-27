package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9));
        List<Integer> actual = App.take(list, 2);
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 4));
        assertThat(actual).isEqualTo(expected);
        // END
    }
}
