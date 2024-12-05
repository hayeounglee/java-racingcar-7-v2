package racingcar.view;

import racingcar.dto.CarDTO;

import java.util.List;

public class OutputView {
    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printOneRound(List<CarDTO> cars) {
        for (CarDTO car : cars) {
            printDistance(car);
        }
        System.out.println();
    }

    private void printDistance(CarDTO car) {
        System.out.println(car.carName() + " : " + "-".repeat(car.distance()));
    }

    public void printResult(List<String> winners) {
        System.out.print("최종 우승자 : ");
        System.out.print(String.join(",", winners));
    }
}
