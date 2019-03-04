package model.filter;

import domain.Taxi;

public interface Filter {
    boolean check(Taxi taxi);
}
