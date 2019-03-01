package model.reader.fake;

import java.util.List;
import java.util.ArrayList;

import model.reader.TaxiReader;
import domain.Taxi;

public class TaxiReaderFakeImpl  implements TaxiReader {
    @Override
    public List<Taxi> read() {
        List<Taxi> taxopark = new ArrayList<>();
        taxopark.add(buildTaxi(100,15,205));
        taxopark.add(buildTaxi(130, 12, 220));
        taxopark.add(buildTaxi(120, 11, 300));
        taxopark.add(buildTaxi(110, 18, 290));
        return taxopark;
    }

    private void build(Taxi taxi, Integer cost, Integer fuelRate, Integer speed){
        taxi.setCost(cost);
        taxi.setFuelRate(fuelRate);
        taxi.setSpeed(speed);
    }

    private Taxi buildTaxi(Integer cost, Integer fuelRate, Integer speed) {
        Taxi taxi = new Taxi();
        build(taxi, cost, fuelRate, speed);
        return taxi;
    }
}
