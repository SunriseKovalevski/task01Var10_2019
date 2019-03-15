package console;

import domain.Taxi;
import model.filter.Filter;
import model.reader.TaxiReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Runner {
    private Scanner scanner = new Scanner(System.in);
    private TaxiReader taxiReader;

    public void setTaxiReader(TaxiReader taxiReader) {
        this.taxiReader = taxiReader;
    }

    @SuppressWarnings("unchecked")
    public void viewTaxi(Filter filter) {
        List<Taxi> taxiList = taxiReader.read();
        Map<Integer, Taxi> filteredTaxi = new HashMap<>();
        Integer order = 0;
        for (Taxi taxi : taxiList) {
            if (filter.check(taxi)) {
                order++;
                filteredTaxi.put(order, taxi);
                System.out.print("Taxi number: ");
                System.out.println(order);
                System.out.print("Cost: ");
                System.out.println(taxi.getCost());
                System.out.print("Fuel Rate: ");
                System.out.println(taxi.getFuelRate());
                System.out.print("max Speed: ");
                System.out.println(taxi.getSpeed());
                System.out.println();
            }
        };
        System.out.println("Taxopark cost: " + taxiReader.getSumm());
        System.out.println("Choose taxi for output");
        order = Integer.parseInt(scanner.nextLine());
        Taxi taxi = filteredTaxi.get(order);
        if(taxi != null) {
            System.out.println(taxi.getCost()+" "+taxi.getFuelRate()+ " " + taxi.getSpeed());      
            //Must write there some famous code
        }
    }

    private AbstractFilterFactory filterFactories[] = {
            new SummFilterFactory(),
            new RangeFilterFactory()
    };

    public Filter inputFilter() {
        System.out.println("With what categegory must filtr?");
        int i = 1;
        for (AbstractFilterFactory factory : filterFactories) {
            System.out.printf("%2d. %s\n", i++, factory.getMenuItem());
        }
        System.out.print("Your choise: ");
        return filterFactories[Integer.parseInt(scanner.nextLine()) - 1].create();
    }

    public static void main(String[] args) {
        Runner runner = RunnerFactory.newInstance();
        Filter filter = runner.inputFilter();
        runner.viewTaxi(filter);
    }
}

