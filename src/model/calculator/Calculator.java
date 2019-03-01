package model.calculator;

import domain.Taxi;

public interface Calculator<T extends  Taxi> {
    Integer fullCost(T taxi, Integer sum);
}
