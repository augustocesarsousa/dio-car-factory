package singleton;

import model.Car;

/**
 * Singleton
 */
public class CarFactory {

  private CarFactory() {
    super();
  }

  private static class InstanceHolder {

    public static CarFactory instance = new CarFactory();
  }

  public static CarFactory getInstance() {
    return InstanceHolder.instance;
  }

  public Car createCar(String model, String color) {
    return new Car(model, color);
  }
}
