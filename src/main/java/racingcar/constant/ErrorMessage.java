package racingcar.constant;

public enum ErrorMessage {
    EXCEPTION_MESSAGE_PREFIX("[ERROR] "),
    INVALID_FORM("올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요."),
    INVALID_NAME_SIZE("이름은 5자 이하여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return EXCEPTION_MESSAGE_PREFIX.message + message;
    }

}
