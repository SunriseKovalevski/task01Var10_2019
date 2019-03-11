package test;

import domain.Taxi;
import factory.FactoryHolder;
import model.reader.TaxiReader;

import java.util.List;

public class TestTaxiReader {
    public static void main(String[] args) {
        TaxiReader reader = FactoryHolder.getFactory().createTaxiReader();
        List<Taxi> taxiList = reader.read();
        for (Taxi taxi : taxiList) {
            System.out.println(taxi);
        }
    }
}
