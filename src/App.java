import java.util.Scanner;

import facade.CarOptional;
import model.Car;
import singleton.CarFactory;
import strategy.CarTest;
import strategy.CarTestGoForward;
import strategy.CarTestTurnLeft;
import strategy.CarTestTurnRight;

public class App {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int option = 0;

    System.out.println("Bem vindo ao DIO Car! Informe abaixo os dados do carro que deseja criar:");

    System.out.print("Modelo: ");
    String model = scanner.nextLine();

    System.out.print("Color: ");
    String color = scanner.nextLine();
    System.out.println("");

    Car car = createCar(model, color);

    System.out.println("Deseja adicionar opcionais?");
    System.out.println("1 - para SIM");
    System.out.println("2 - para NÃO");
    System.out.print("Opção: ");
    option = scanner.nextInt();
    System.out.println("");
    switch (option) {
      case 1:
        addOptionals(car);
        break;
      default:
        break;
    }

    System.out.println("Deseja testar o carro?");
    System.out.println("1 - para SIM");
    System.out.println("2 - para NÃO");
    System.out.print("Opção: ");
    option = scanner.nextInt();
    System.out.println("");
    switch (option) {
      case 1:
        makeTest(car);
        break;
      default:
        break;
    }

    System.out.println("Carro criado com sucesso!\n");
    System.out.println(car);

    scanner.close();
  }

  public static Car createCar(String model, String color) {
    CarFactory carFactory = CarFactory.getInstance();
    return carFactory.createCar(model, color);
  }

  public static void addOptionals(Car car) {
    CarOptional carOptional = CarOptional.getInstance();
    boolean option = true;

    while (option) {
      System.out.println("Selecione o kit abaixo:");
      System.out.println("1 - para Kit Dignidade (Ar Condicionado, Vidro Elétrico, Trava Elétrica)");
      System.out.println("2 - para Kit Premium (Kit Dignidade, mais, AirBags, Freio à Disco, Câmera de Ré)");
      System.out
          .println("3 - para Kit Elite (Kit Premium, mais, Banco de Couro, Central Multimídia, Roda de Liga Leve)");
      System.out.print("Opção: ");
      int kit = scanner.nextInt();
      System.out.println("");
      switch (kit) {
        case 1:
          carOptional.optionalKitBasic(car);
          option = false;
          break;
        case 2:
          carOptional.optionalKitPremium(car);
          option = false;
          break;
        case 3:
          carOptional.optionalKitElite(car);
          option = false;
          break;
        default:
          System.out.println("Essa opção não existe!\n");
          break;
      }
    }
  }

  public static void makeTest(Car car) {
    boolean option = true;

    CarTest goForward = new CarTestGoForward();
    CarTest turnLeft = new CarTestTurnLeft();
    CarTest turnRight = new CarTestTurnRight();

    while (option) {
      System.out.println("Selecione o teste abaixo:");
      System.out.println("1 - para mover para frente");
      System.out.println("2 - para virar à esquerda");
      System.out.println("3 - para virar à direita");
      System.out.println("4 - para sair");
      System.out.print("Opção: ");
      int test = scanner.nextInt();
      System.out.println("");
      switch (test) {
        case 1:
          car.setTest(goForward);
          car.move();
          break;
        case 2:
          car.setTest(turnLeft);
          car.move();
          break;
        case 3:
          car.setTest(turnRight);
          car.move();
          break;
        case 4:
          option = false;
          break;
        default:
          System.out.println("Essa opção não existe!\n");
          break;
      }
    }
  }
}
