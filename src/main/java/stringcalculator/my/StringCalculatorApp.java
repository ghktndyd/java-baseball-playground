package stringcalculator.my;

import java.util.Scanner;

public class StringCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int calculate = calculate(value);
        System.out.println("calculate = " + calculate);
    }

    private static int calculate(String value) {
        String[] values = value.split(" ");
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            String operator = values[i];
            int number = Integer.parseInt(values[i + 1]);

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            } else if (operator.equals("*")) {
                result *= number;
            } else if (operator.equals("/")) {
                result /= number;
            } else {
                throw new IllegalArgumentException("올바르지 않은 연산자입니다 : " + operator);
            }
        }

        return result;
    }
}
