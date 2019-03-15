package model.filter;

import domain.Taxi;

public class SpeedFilter implements Filter{
    private Integer speed;

    public SpeedFilter(Integer speed) {
        this.speed = speed;
    }

    @Override
    public boolean check(Taxi taxi) {
        return taxi.getSpeed() >= speed;
    }
}
