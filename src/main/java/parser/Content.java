package parser;

public class Content {
	
public String downloadContent(String adress) throws Exception {
        URL url = new URL(adress);
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
        return str;
    }

    public static void copy(InputStream in, OutputStream out) throws IOException {
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
