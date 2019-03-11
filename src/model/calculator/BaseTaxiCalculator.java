package model.calculator;

//Тутачки логику поправить чуть более чем полностью

import domain.Taxi;

abstract public class BaseTaxiCalculator<T extends Taxi> implements Calculator<T>{
    public Integer fullCost(T taxi, Integer summ) {
        return (int)Math.ceil(summ*42);
    }
}
