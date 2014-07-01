import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AccountEuro extends Account {
	public long clientId;
	public String date;
	public double euro;
	public long accountId;

	public AccountEuro() {
	}

	public AccountEuro(long clientId, double euro) {
		this.clientId = clientId;
		this.euro = euro;
		date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(Calendar
				.getInstance().getTime());
		this.accountId = ++accountId;
	}

	public double putMoney(double quantity) {
		euro += quantity;
		return euro;
	}

	public void takeMoney(double quantity) {
		euro -= quantity;
	}

	@Override
	public String toString() {

		StringBuilder sb;
		sb = new StringBuilder()

		.append("     { Euro=" + euro)
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


//    public double getEuro() {
//		return euro;
//	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public long getAccountId() {
		return accountId;
	}

	public long getClientId() {
		return clientId;
	}
}