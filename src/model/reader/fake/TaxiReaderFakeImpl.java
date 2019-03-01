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
    }

    private void build(Taxi taxi, Integer cost, Integer fuelRate, Integer speed){
        taxi.setCost(cost);
        taxi.setFuelRate(fuelRate);
        taxi.setSpeed(speed);
    }
}
