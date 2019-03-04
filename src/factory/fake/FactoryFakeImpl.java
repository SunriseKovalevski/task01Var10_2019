package factory.fake;

import model.reader.TaxiReader;
import model.reader.fake.TaxiReaderFakeImpl;

public class FactoryFakeImpl {
    @Override
    public TaxiReader createTaxiReader() {
        return new TaxiReaderFakeImpl();

    }
}
