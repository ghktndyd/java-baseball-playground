package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1-1")
    void stringSplit() {
        String splitTarget = "1,2";

        String[] splitResult = splitTarget.split(",");

        assertThat(splitTarget).contains("1", "2");
    }

}
