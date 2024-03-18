package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    @DisplayName("split() 테스트")
    void splitTest() {
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");

        assertThat(values).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }
}
