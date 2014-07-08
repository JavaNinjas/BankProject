package parser;

public class Content {
	public void GetContent() {
		try {
			ContentEurUah contentEurUah = new ContentEurUah();
			contentEurUah.downloadContent();
			ContentUsdUah contentUsdUah = new ContentUsdUah();
			contentUsdUah.downloadContent();
			ContentEurUsd contentEurUsd = new ContentEurUsd();
			contentEurUsd.downloadContent();
		} catch (Exception ex) {
			System.out.println("Помилка");
			ex.printStackTrace();
		}
	}
}
