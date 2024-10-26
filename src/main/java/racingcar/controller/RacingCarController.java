package racingcar.controller;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.service.RacingCarGameService;
import racingcar.service.SeperateCarNameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {

    private final SeperateCarNameService seperateCarNameService;
    private final RacingCarGameService racingCarGameService;

    private final OutputView outputView;
    private final InputView inputView;


    public RacingCarController(final SeperateCarNameService seperateCarNameService,
                               final RacingCarGameService racingCarGameService,
                               final OutputView outputView,
                               final InputView inputView){

        this.seperateCarNameService = seperateCarNameService;
        this.racingCarGameService = racingCarGameService;
        this.outputView = outputView;
        this.inputView = inputView;

    }

    public void run(){

        outputView.printInsertRacingCarName();
        String carNamesWithDelimeter = inputView.racingCarNamesWithDelimeter();

        Cars cars = seperateCarNameService.seperate(carNamesWithDelimeter);






    }



}