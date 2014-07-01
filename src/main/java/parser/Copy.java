import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
	public void copy(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		while (true) {
			int readCount = in.read(buffer);
			if (readCount == -1) {
				break;
			}
			out.write(buffer, 0, readCount);
		}
	}
}
