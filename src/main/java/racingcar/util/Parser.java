package racingcar.util;

import racingcar.constant.ErrorMessage;

public class Parser {
    public static int parseToInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_FORM.getMessage());
        }
    }
}
