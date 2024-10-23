package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private static final int RANDOM_MIN_NUMBER = 0;
    private static final int RANDOM_MAX_NUMBER = 9;
    private static final int MOVEMENT_CRITERIA = 4;
    private final List<Car> cars;
    private final int attemptCount;

    public Game(String[] carNames, int attemptCount) {
        this.cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }

        this.attemptCount = attemptCount;
    }

    public void play() {
        for (int i = 0; i < attemptCount; i++) {
            attemptToMoveCars();
        }
    }

    private void attemptToMoveCars() {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);

            if (randomNumber >= MOVEMENT_CRITERIA) {
                car.move();
            }
        }
    }
}