package racingcar.view;

import java.util.List;
import racingcar.model.CarMovementResults;
import racingcar.model.CarMovementResults.CarMovementResult;

public class OutputView {
    private static OutputView instance;

    private OutputView() {
    }

    public static OutputView getInstance() {
        if (instance == null) {
            instance = new OutputView();
        }
        return instance;
    }

    public void displayMovementResults(List<CarMovementResults> resultDtos) {

        System.out.println("실행 결과");

        for (CarMovementResults resultDto : resultDtos) {
            resultDto.getCarMovementResults().forEach(this::displayMovementOfOneCar);
            System.out.println();
        }

    }

    private void displayMovementOfOneCar(CarMovementResult movementResult) {
        String name = movementResult.name();
        int position = movementResult.position();

        String result = name + " : " + "-".repeat(position);
        System.out.println(result);
    }
}