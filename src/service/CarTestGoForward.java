package service;

import model.Car;

/**
 * CarTestGoForward
 */
public class CarTestGoForward implements CarTest {

    @Override
    public void move(Car car) {
        System.out.println(car.getModel() + " " + car.getColor() + " foi pra frente...");
    }

}