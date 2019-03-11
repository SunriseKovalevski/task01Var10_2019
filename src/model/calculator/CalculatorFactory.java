package model.calculator;

import domain.Taxi;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFactory {
    private static Map<Class<? extends Taxi>, Calculator<?>> calculators = new HashMap<>();

    static {
        calculators.put(Taxi.class, new TaxiCalculator());
    }

    @SuppressWarnings("unchecked")
    public static <T extends Taxi> Calculator<T> create(Class<T> c){
        return (Calculator<T>)calculators.get(c);
    }
}
