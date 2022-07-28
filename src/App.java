import model.Car;
import service.CarFactory;
import service.CarTest;
import service.CarTestGoForward;
import service.CarTestTurnLeft;
import service.CarTestTurnRight;

public class App {

  public static void main(String[] args) throws Exception {
    CarFactory factory1 = CarFactory.getInstance();
    Car car1 = factory1.createCar("Fusca", "Preto");
    System.out.println(car1);

    CarTest goForward = new CarTestGoForward();
    CarTest turnLeft = new CarTestTurnLeft();
    CarTest turnRight = new CarTestTurnRight();

    car1.setTest(goForward);
    car1.move();
    car1.setTest(turnLeft);
    car1.move();
    car1.setTest(turnRight);
    car1.move();
  }
}
