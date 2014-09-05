package parser;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public enum Rates {
    USD(Parser.getRate("USDUAH")),
    EUR(Parser.getRate("EURUAH")),
    RUB(Parser.getRate("RUBUAH"));

    private final String rate;

    Rates(Double rate) {
        this.rate = format(rate);
    }

    public String getRate() {
        return rate;
    }

    public static String format(double number) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        return formatter.format(number);
    }
}
