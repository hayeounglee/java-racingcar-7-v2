package racingcar.validator;

import racingcar.constant.ErrorMessage;

public class CarNameValidator {
    private static int MAX_CAR_NAME_SIZE = 5;

    public void validate(String input) {
        if (input.length() > MAX_CAR_NAME_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_SIZE.getMessage());
        }
    }
}
