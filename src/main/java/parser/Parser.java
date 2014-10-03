package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {
    static int tries = 3;

    public static double getRate(String exchangeRate) {
        /**
         * Possible values for exchangeRate are:
         * USDUAH, USDEUR, USDRUB, RUBUAH, UAHEUR etc.
         */
        Elements data = new Elements();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("http://finance.yahoo.com/q?s=").append(exchangeRate).append("=X");
            Document doc = Jsoup.connect(sb.toString()).get();
            data = doc.select("span.time_rtq_ticker");

        } catch (Exception e) {
            if (tries > 0) {
                getRate(exchangeRate);
                tries--;
            }
        }
        return Double.parseDouble(data.text());
    }
}
