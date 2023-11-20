package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


public class SetTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Test Case 구현

    @Test
    @DisplayName("요구사항 1")
    void setSizeVerify() {
        int setSize = numbers.size();

        // 아래 코드도 되지만 참고해 보니 assertj에서는 Collection 검증 기능도 지원한다.
        // assertThat(setSize).isEqualTo(3);

        assertThat(numbers).hasSize(3);
    }

    @DisplayName("요구사항 2")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(int number) {
        assertThat(numbers).contains(number);
    }

    @DisplayName("요구사항 3")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true"}, delimiter = ':')
    void numberContainsNumbers(int value, boolean expected) {
        assertThat(numbers.contains(value)).isEqualTo(expected);
    }
}
