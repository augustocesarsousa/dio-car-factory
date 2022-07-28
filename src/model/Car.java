package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import strategy.CarTest;

/**
 * Car
 */
public class Car {

    private String model;
    private String color;
    private List<String> optional = new ArrayList<>();
    private CarTest test;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getOptional() {
        return optional;
    }

    public void setTest(CarTest test) {
        this.test = test;
    }

    public void move() {
        test.move(this);
    }

    @Override
    public String toString() {
        Collections.sort(optional);
        return ("Modelo: " + model + "\nCor: " + color + "\nOpcionais: " + optional + "\n");
    }
}
