package console;

import model.filter.Filter;
import model.filter.SpeedFilter;

public class SummFilterFactory extends AbstractFilterFactory {
    public SummFilterFactory() {
        super("по скорости");
    }
    @Override
    public Filter create() {
        System.out.print("Введите желаемую скорость: ");
        Integer summ = Integer.parseInt(scanner.nextLine());
        return new SpeedFilter(summ);
    }
}
