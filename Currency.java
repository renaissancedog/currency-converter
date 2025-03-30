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
        currencies.add(new Currency("Australian Dollar",  1.590436));
        currencies.add(new Currency("Brazilian Real",  5.7597794));
        currencies.add(new Currency("Canadian Dollar",  1.4318968));
        currencies.add(new Currency("Chinese Yuan",  7.2627579));
        currencies.add(new Currency("Euro",  0.92453138));
        currencies.add(new Currency("Hong Kong Dollar",  7.7780742));
        currencies.add(new Currency("Indian Rupee",  85.537373));
        currencies.add(new Currency("Japanese Yen",  150.12172));
        currencies.add(new Currency("Mexican Peso",  20.358714));
        currencies.add(new Currency("New Taiwan Dollar",  33.229693));
        currencies.add(new Currency("New Zealand Dollar",  1.7497891));
        currencies.add(new Currency("Norwegian Krone",  10.490181));
        currencies.add(new Currency("Pound Sterling",  0.7725545));
        currencies.add(new Currency("Russian Ruble",  84.949089));
        currencies.add(new Currency("Singapore Dollar",  1.342494));
        currencies.add(new Currency("South African Rand",  18.386567));
        currencies.add(new Currency("South Korean Won",  1470.3885));
        currencies.add(new Currency("Swedish Krona",  10.007625));
        currencies.add(new Currency("Swiss Franc",  0.88076886));
        currencies.add(new Currency("United States Dollar",  1));
        return currencies;
    }
}
