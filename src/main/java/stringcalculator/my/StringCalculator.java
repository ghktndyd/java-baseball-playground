package stringcalculator.my;

import java.util.HashMap;

/**
 * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
 * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다.
 * 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
 * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
 **/

public class StringCalculator {

    HashMap<String, String> operators;

    public StringCalculator() {
        operators = new HashMap<>();
        operators.put("PLUS", "+");
        operators.put("MINUS", "-");
        operators.put("MULTIPLY", "*");
        operators.put("DIVIDE", "/");
    }

    public String[] inputStringToStringArray(String input) {
        final String SPLIT_TARGET = " ";
        return input.split(SPLIT_TARGET);
    }

    public int inputStringToInt(String input) {
        return Integer.parseInt(input);
    }

    public Integer checkOperatorAndCalculate(int firstValue, String operator, int secondValue) {
        if (operator.equals(operators.get("PLUS"))) {
            return firstValue + secondValue;
        }
        if (operator.equals(operators.get("MINUS"))) {
            return firstValue - secondValue;
        }
        if (operator.equals(operators.get("MULTIPLY"))) {
            return firstValue * secondValue;
        }
        if (operator.equals(operators.get("DIVIDE"))) {
            try {
                return firstValue / secondValue;
            } catch (ArithmeticException e) {
                System.out.println("0은 나눌 수 없습니다.");
            }
        }
        return null;
    }


}
