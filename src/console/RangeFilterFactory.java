package console;

import model.filter.Filter;
import model.filter.RangeFilter;

public class RangeFilterFactory extends AbstractFilterFactory {
    public RangeFilterFactory() {
        super ("by fuel rate");
    }

    @Override
    public Filter create() {
        System.out.print("Input maximum rate of fuel (in Liters): ");
        Integer fuel = Integer.parseInt(scanner.nextLine());
        return new RangeFilter(fuel);
    }
}
