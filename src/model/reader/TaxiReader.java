package model.reader;

import java.util.List;

import domain.Taxi;

public interface TaxiReader {
    List<Taxi> read();
    Integer getSumm();
}
