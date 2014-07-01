import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AccountUah extends Account {
	public long clientId;
	public String date;
	public double uah;
	public long accountId;

	public AccountUah() {
	}

	public AccountUah(long clientId, double uah) {
		this.clientId = clientId;
		this.uah = uah;
		this.date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar
				.getInstance().getTime());
		this.accountId = ++accountId;
	}

	public double putMoney(double quantity) {
		uah += quantity;
		setUah(uah);
		return uah;
	}

	public void takeMoney(double quantity) {
		uah -= quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb;
		sb = new StringBuilder()
				.append("      { UAH=" + uah)
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

	public double getUah() {
		return uah;
	}

	public void setUah(double uah) {
		this.uah = uah;
	}

	public long getAccountId() {
		return accountId;
	}
}
