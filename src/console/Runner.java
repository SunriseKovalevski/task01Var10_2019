package console;

import domain.Taxi;
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
                System.out.print(order);
            }
        }
        System.out.println("Выберите машину такси для вывода");
        order = Integer.parseInt(scanner.nextLine());
        Taxi taxi = filteredTaxi.get(order);
        if(taxi != null) {
            System.out.println("**Начало диапазона*");
            Integer summ = Integer.parseInt(scanner.nextLine());
            Class<Taxi> c = (Class<Taxi>)taxi.getClass();
            // СЮДА НЕ ЗАБЫТЬ ВСЕ НАПИСАТЬ
        }
    }

    private AbstractFilterFactory filterFactories[] = {
            new SummFilterFactory(),
            new RangeFilterFactory()
    };

    public Filter inputFilter() {
        System.out.println("По какому критерию фильтровать?");
        int i = i;
        for (AbstractFilterFactory factory : filterFactories) {
            System.out.printf("%2d. %s\n", i++, factory.getMenuItem());
        }
        System.out.print("Ваш выбор: ");
        return filterFactories[Integer.parseInt(scanner.nextLine()) - 1].create();
    }

    public static void main(String[] args) {
        Runner runner = RunnerFactory.newInstance();
        Filter filter = runner.inputFilter();
        runner.viewTaxi(filter);
    }
}

