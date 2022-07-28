package service;

import model.Car;

/**
 * CarTestTurnLeft
 */
public class CarTestTurnLeft implements CarTest {

    @Override
    public void move(Car car) {
        System.out.println(car.getModel() + " " + car.getColor() + " virou à esquerda...");
    }

}