package parser;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

public class ContentUsdUah {
	
	public void downloadContent() throws Exception {
		URL url = new URL("https://finance.yahoo.com/q?s=usduah=x");
		InputStream in = url.openStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Copy c = new Copy();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			try {
				c.copy(in, oos);
			} finally {
				oos.close();
			}
		} finally {
			in.close();
		}
		String str = baos.toString();
		RateUsdUah r = new RateUsdUah();
		r.doMatch(str);
		String result = r.getFinalresult();
		//System.out.println("USD/UAH = " + result);
	}
}
