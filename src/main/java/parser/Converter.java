package parser;

import org.joda.money.Money;
import java.math.RoundingMode;

public class Converter {
    public static String convert(Money money, double exchangeRate) {
        Money converted = money.multipliedBy(exchangeRate, RoundingMode.HALF_UP);
        return converted.toString();
    }
}
