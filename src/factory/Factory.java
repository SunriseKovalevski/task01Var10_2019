package factory;

import model.reader.TaxiReader;

public interface Factory {
    TaxiReader createTaxiReader();
}
