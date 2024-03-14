package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

        assertThat(splitResult).containsExactly("1", "2");
    }

    @Test
    @DisplayName("요구사항 1-2")
    void stringSplit2() {
        String splitTarget = "1";

        String[] splitResult = splitTarget.split(",");

        assertThat(splitResult).contains("1");
    }

    @Test
    @DisplayName("요구사항 2")
    void subString() {
        String subStringTarget = "(1,2)";

        String substringResult = subStringTarget.substring(1, 4);

        assertThat(substringResult).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항 3-1")
    void stringCharAt() {
        String charAtTarget = "abc";

        char charAtResult = charAtTarget.charAt(0);

        assertThat(charAtResult).isEqualTo('a');
    }

    @Test
    @DisplayName("IndexOutOfBoundsException 발생 테스트")
    void indexOutOfBoundsExceptionTest() {
        String target = "abc";
        int index = 3;


        assertThatThrownBy(() -> {
            target.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d", index);
    }
}
