package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RateEurUah {
    private static String finalresult;

    public String getFinalresult() {
        return finalresult;
    }

    public void setFinalresult(String result) {
        RateEurUah.finalresult = result;
    }

    public final static Pattern pattern = Pattern
            .compile("yfs_l10_euruah=x\">[0-9]{2}\\.[0-9]{2,10}<");

    public void findRate(String content) {
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String str = (matcher.group()).toString();
           setFinalresult(str.substring((str.length() - 8), (str.length() - 1)));
        }
     }

}
