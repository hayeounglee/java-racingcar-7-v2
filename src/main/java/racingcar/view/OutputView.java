package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printOneRound(List<Car> cars) {
        for (Car car : cars) {
            printDistance(car);
        }
        System.out.println();
    }

    private void printDistance(Car car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getDistance()));
    }

    public void printResult(List<String> winners) {
        System.out.print("최종 우승자 : ");
        System.out.print(String.join(",", winners));
    }
}
