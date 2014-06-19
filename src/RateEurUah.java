import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RateEurUah {
	public static final Pattern pattern = Pattern
			.compile("yfs_l10_euruah=x\">[0-9]{2}\\.[0-9]{2,10}<");

	public static void doMatch(String content) {

		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {

			String str = (matcher.group()).toString();
			String rateEurUah = str.substring((str.length() - 8),
					(str.length() - 1));
			System.out.println("EUR/UAH = " + Float.parseFloat(rateEurUah));
		}
	}

	private static void copy(InputStream in, OutputStream out)
			throws IOException {
		byte[] buffer = new byte[1024];
		while (true) {
			int readCount = in.read(buffer);
			if (readCount == -1) {
				break;
			}
			out.write(buffer, 0, readCount);
		}
	}

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://finance.yahoo.com/q?s=EURUAH=X");
		InputStream in = url.openStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {

			ObjectOutputStream oos = new ObjectOutputStream(baos);
			try {
				copy(in, oos);
			} finally {
				oos.close();
			}
		} finally {
			in.close();
		}
		String str = baos.toString();
		doMatch(str);
	}
}
