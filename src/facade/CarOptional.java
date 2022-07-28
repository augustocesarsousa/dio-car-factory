package facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Car;

/**
 * CarOptional
 */
public class CarOptional {

    private List<String> kitBasic = new ArrayList<>(
            Arrays.asList("Ar Condicionado", "Vidro Elétrico", "Trava Elétrica"));
    private List<String> kitPremium = new ArrayList<>(Arrays.asList("AirBags", "Freio à Disco", "Câmera de Ré"));
    private List<String> kitElite = new ArrayList<>(
            Arrays.asList("Banco de Couro", "Central Multimídia", "Roda de Liga Leve"));

    private CarOptional() {
        super();
    }

    private static class InstanceHolder {
        public static CarOptional instance = new CarOptional();
    }

    public static CarOptional getInstance() {
        return InstanceHolder.instance;
    }

    public void optionalKitBasic(Car car) {
        car.getOptional().addAll(kitBasic);
    }

    public void optionalKitPremium(Car car) {
        car.getOptional().addAll(kitBasic);
        car.getOptional().addAll(kitPremium);
    }

    public void optionalKitElite(Car car) {
        car.getOptional().addAll(kitBasic);
        car.getOptional().addAll(kitPremium);
        car.getOptional().addAll(kitElite);
    }
}