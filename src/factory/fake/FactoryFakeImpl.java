package factory.fake;

import factory.Factory;
import model.reader.TaxiReader;
import model.reader.fake.TaxiReaderFakeImpl;

public class FactoryFakeImpl implements Factory{
    @Override
    public TaxiReader createTaxiReader() {
        return new TaxiReaderFakeImpl();

    }
}
