import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AccountUsd extends Account {
	public long clientId;
	public String date;
	public double usd;
	public long accountId;
	

	public AccountUsd() {
	}

	public AccountUsd(long clientId, double usd) {
		this.clientId = clientId;
		this.usd = usd;
		this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar
				.getInstance().getTime());
		this.accountId  = ++accountId;
	}

	public void putMoney(double quantity) {
		usd += quantity;
		setUsd(usd);
	}

	public void takeMoney(double quantity) {
		usd -= quantity;
		setUsd(usd);
	}

	@Override
	public String toString() {
		StringBuilder sb;
		sb = new StringBuilder()
				.append("      { USD=" + usd)
				.append(", date=" + date)
				.append(", AccountId = " + getAccountId())
				.append("}");
		return sb.toString();
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getUsd() {
		return usd;
	}

	public void setUsd(double usd) {
		this.usd = usd;
	}

	public long getAccountId() {
		return accountId;
	}

}
