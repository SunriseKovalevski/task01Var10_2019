package console;

import model.filter.Filter;
import model.filter.SpeedFilter;

public class SummFilterFactory extends AbstractFilterFactory {
    public SummFilterFactory() {
        super("by speed");
    }
    @Override
    public Filter create() {
        System.out.print("Please, input minimal speed: ");
        Integer summ = Integer.parseInt(scanner.nextLine());
        return new SpeedFilter(summ);
    }
}
