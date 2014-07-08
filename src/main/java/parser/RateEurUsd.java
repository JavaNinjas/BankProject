package parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RateEurUsd {
	private static String finalresult;

	public String getFinalresult() {
		return finalresult;
	}

	public void setFinalresult(String result) {
		RateEurUsd.finalresult = result;
	}

	public static final Pattern pattern = Pattern
			.compile("yfs_l10_eurusd=x\">[0-9]\\.[0-9]{2,10}<");

	public void doMatch(String content) {
		String rateEurUsd = "";
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {

			String str = (matcher.group()).toString();
			rateEurUsd = str.substring((str.length() - 7), (str.length() - 1));
		}
		setFinalresult(rateEurUsd);
	}
}
