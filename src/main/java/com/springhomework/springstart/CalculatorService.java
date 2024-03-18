package com.springhomework.springstart;

import org.springframework.stereotype.Service;


@Service
public class CalculatorService {
    public String showMessage() {
        return "<p style=\"font-size:32px\"><b>Добро пожаловать в калькулятор!</b></p>";
    }

    public String add(Double value1, Double value2) {
        if (checkNullValues(value1, value2)) {
            return "Не все значения заполнены";
        }

        return String.format("%s + %s = %s", value1, value2, value1 + value2);
    }

    public String subtract(Double value1, Double value2) {
        if (checkNullValues(value1, value2)) {
            return "Не все значения заполнены";
        }

        return String.format("%s - %s = %s", value1, value2, value1 - value2);
    }

    public String multiply(Double value1, Double value2) {
        if (checkNullValues(value1, value2)) {
            return "Не все значения заполнены";
        }

        return String.format("%s * %s = %s", value1, value2, value1 * value2);
    }

    public String divide(Double value1, Double value2) {
        if (checkNullValues(value1, value2)) {
            return "Не все значения заполнены";
        }

        if (value2 == 0) {
            return "Деление на ноль!";
        }

        return String.format("%s / %s = %s", value1, value2, value1 / value2);
    }

    private boolean checkNullValues(Double value1, Double value2) {
        return value1 == null || value2 == null;
    }
}
