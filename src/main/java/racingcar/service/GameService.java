package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.dto.CarDTO;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    private final static int MIN_RANDOM_RANGE = 0;
    private final static int MAX_RANDOM_RANGE = 9;

    private final List<Car> cars;

    public GameService() {
        cars = new ArrayList<>();
    }

    public void makeCars(String input) {
        String[] carNames = input.split(",");
        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    public void playOneRound() {
        for (Car car : cars) {
            car.increaseDistance(Randoms.pickNumberInRange(MIN_RANDOM_RANGE, MAX_RANDOM_RANGE));
        }
    }

    public List<String> calculateResult() {
        List<String> result = new ArrayList<>();
        int maxDistance = cars.stream().mapToInt(Car::getDistance).max().orElse(0);

        for (Car car : cars) {
            if (car.getDistance() == maxDistance) {
                result.add(car.getName());
            }
        }
        return result;
    }

    public List<CarDTO> getCars() {
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(new CarDTO(car.getName(), car.getDistance()))
        }
        return carDTOS;
    }
}
