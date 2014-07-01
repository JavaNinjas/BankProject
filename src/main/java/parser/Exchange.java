public class Exchange {

	public double fromUSDtoUAH(double usd) {
		double uah = usd
				* (Double.parseDouble(new RateUsdUah().getFinalresult()));
		return uah;
	}

	public double fromEURtoUAH(double eur) {
		double uah = eur
				* (Double.parseDouble(new RateEurUah().getFinalresult()));
		return uah;
	}

	public double fromEURtoUSD(double eur) {
		double usd = eur
				* (Double.parseDouble(new RateEurUsd().getFinalresult()));
		return usd;
	}

	public double fromUAHtoUSD(double uah) {
		double usd = uah
				/ (Double.parseDouble(new RateUsdUah().getFinalresult()));
		return usd;
	}

	public double fromUAHtoEUR(double uah) {
		double eur = uah
				/ (Double.parseDouble(new RateEurUah().getFinalresult()));
		return eur;
	}

	public double fromUSDtoEUR(double usd) {
		double eur = usd
				/ (Double.parseDouble(new RateEurUsd().getFinalresult()));
		return eur;
	}
}
