package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RateUsdUah {
	public static String finalresult;

	public String getFinalresult() {
		return finalresult;
	}

	public void setFinalresult(String result) {
		RateUsdUah.finalresult = result;
	}

	public static final Pattern pattern = Pattern
			.compile("yfs_l10_usduah=x\">[0-9]{2}\\.[0-9]{2,10}<");

	public void doMatch(String content) {
		String rateUsdUah = "";
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			String str = (matcher.group()).toString();
			rateUsdUah = (str.substring((str.length() - 8),
					(str.length() - 1)));
		}	setFinalresult(rateUsdUah);
	} 
}
