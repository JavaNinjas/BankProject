package servlets;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class PasswordService {
    private static PasswordService instance;

    private PasswordService() {
    }

    public synchronized String encrypt(String plaintext) {
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("SHA");
        } catch (NoSuchAlgorithmException e) {
            e.getStackTrace();
        }

        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.getStackTrace();
        }

        byte raw[] = md.digest();
        String hash = (new BASE64Encoder().encode(raw));
        return hash;
    }

    public static synchronized PasswordService getInstance() {
        if (instance == null) {
            instance = new PasswordService();
        }
        return instance;
    }
}
