package model.filter;

import domain.Taxi;

//мне надо диапазон скоростей такта

public class SpeedFilter implements Filter{
    private Integer speed;

    public SpeedFilter(Integer speed) {
        this.speed = speed;
    }

    @Override
    public boolean check(Taxi taxi) {
        return taxi.getMinSpeed() <= speed && speed <= taxi.getMaxSpeed();
    }
}
