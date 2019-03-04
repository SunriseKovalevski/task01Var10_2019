package console;

import factory.FactoryHolder;

public class RunnerFactory {
    public static Runner newInstance() {
        Runner runner = new Runner();
        runner.setTaxiReader(FactoryHolder.getFactory().createTaxiReader());
        return runner;
    }
}
