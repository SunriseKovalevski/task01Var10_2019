package model.filter;

import domain.Taxi;

public class AndFilter  implements Filter{
    private Filter a;
    private Filter b;

    public AndFilter(Filter a, Filter b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean check(Taxi taxi) {
        return a.check(taxi) && b.check(taxi);
    }
}
