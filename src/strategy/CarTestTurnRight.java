package strategy;

import model.Car;

/**
 * CarTestTurnRight
 */
public class CarTestTurnRight implements CarTest {

    @Override
    public void move(Car car) {
        System.out.println(car.getModel() + " " + car.getColor() + " virou à direita...\n");
    }
}