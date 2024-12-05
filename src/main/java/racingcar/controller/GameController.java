package racingcar.controller;

import racingcar.service.GameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final GameService gameService;

    public GameController(InputView inputView, OutputView outputView, GameService gameService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.gameService = gameService;
    }

    public void run() {
        gameService.makeCars(inputView.getCarName());
        play(inputView.getTryCount());
    }

    public void play(int tryCount) {
        outputView.printResultMessage();
        while (tryCount-- > 0) {
            gameService.playOneRound();
            outputView.printOneRound(gameService.getCars());
        }
        outputView.printResult(gameService.calculateResult());
    }
}
