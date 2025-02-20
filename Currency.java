import java.util.ArrayList;

public class Currency {
    private final String name;
    public double value;


    public Currency(String nameValue, double value) {
        this.name = nameValue;
        this.value=value;
    }

    public String getName() {
        return this.name;
    }

    public static ArrayList<Currency> init() {
        ArrayList<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("Australian Dollar",  1.519088));
        currencies.add(new Currency("Brazilian Real",  5.0495262));
        currencies.add(new Currency("Canadian Dollar",  1.3551792));
        currencies.add(new Currency("Chinese Yuan",  7.2331831));
        currencies.add(new Currency("Euro",  0.9229836));
        currencies.add(new Currency("Hong Kong Dollar",  7.8284998));
        currencies.add(new Currency("Indian Rupee",  83.455262));
        currencies.add(new Currency("Japanese Yen",  151.28644));
        currencies.add(new Currency("Mexican Peso",  16.607157));
        currencies.add(new Currency("New Taiwan Dollar",  32.098222));
        currencies.add(new Currency("New Zealand Dollar",  1.6610567));
        currencies.add(new Currency("Norwegian Krone",  10.647166));
        currencies.add(new Currency("Pound Sterling",  0.79121133));
        currencies.add(new Currency("Russian Ruble",  91.630855));
        currencies.add(new Currency("Singapore Dollar",  1.3490894));
        currencies.add(new Currency("South African Rand",  18.738066));
        currencies.add(new Currency("South Korean Won",  1352.1106));
        currencies.add(new Currency("Swedish Krona",  10.646436));
        currencies.add(new Currency("Swiss Franc",  0.90159304));
        currencies.add(new Currency("United States Dollar",  1));
        return currencies;
    }
}
