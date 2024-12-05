package racingcar.validator;

import racingcar.constant.ErrorMessage;

public class CommonValidator {
    public void validateEmpty(String input) {
        if (input.isBlank() || input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_FORM.getMessage());
        }
    }
}
