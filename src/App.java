import model.Car;
import service.CarFactory;

public class App {

  public static void main(String[] args) throws Exception {
    CarFactory factory1 = CarFactory.getInstance();
    Car car1 = factory1.createCar("Fusca", "Preto");
    CarFactory factory2 = CarFactory.getInstance();
    Car car2 = factory2.createCar("Brasília", "Amarela");
    System.out.println(car1);
    System.out.println(car2);
  }
}
