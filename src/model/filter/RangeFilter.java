package model.filter;

import domain.Taxi;

public class RangeFilter implements  Filter{
    private Integer range;

    public RangeFilter(Integer range) {
        this.range = range;
    }

    @Override
    public boolean check(Taxi taxi){
        return taxi.getFuelRate() >= range;
    }
}
