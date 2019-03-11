package console;

import model.filter.Filter;
import model.filter.RangeFilter;

public class RangeFilterFactory extends AbstractFilterFactory {
    public RangeFilterFactory() {
        super ("по расходу топлива");
    }

    @Override
    public Filter create() {
        System.out.print("Введите минимальное количество топлива (в литрах): ");
        Integer fuel = Integer.parseInt(scanner.nextLine());
        return new RangeFilter(fuel);
    }
}
