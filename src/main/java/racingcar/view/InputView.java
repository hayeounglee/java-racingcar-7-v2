package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Parser;
import racingcar.validator.CommonValidator;

public class InputView {
    private final CommonValidator commonInputValidator;

    public InputView() {
        commonInputValidator = new CommonValidator();
    }

    public String getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return getInput();
    }

    public int getTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Parser.parseToInt(getInput());
    }

    private String getInput() {
        String input = Console.readLine();
        commonInputValidator.validateEmpty(input);
        return input;
    }
}
