package racingcar.model;

import racingcar.validator.CarNameValidator;

public class Car {
    private static final int MIN_RANDOM_NUMBER = 4;
    private static final int MOVE_DISTANCE_ONE_TIME = 1;

    private final String name;
    private int distance;

    public Car(String input) {
        CarNameValidator carNameValidator = new CarNameValidator();
        carNameValidator.validate(input);
        name = input;
        distance = 0;
    }

    public void increaseDistance(int random) {
        if (random >= MIN_RANDOM_NUMBER) {
            distance += MOVE_DISTANCE_ONE_TIME;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
