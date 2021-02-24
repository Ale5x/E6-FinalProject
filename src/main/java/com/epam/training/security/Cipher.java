package com.epam.training.security;

import com.epam.training.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Cipher {

    private final static Logger logger = LogManager.getLogger(Cipher.class);

    private Cipher() {}

    public static String setCipherString(String line) {
        StringBuilder lineCipher = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(line.getBytes());
            lineCipher = new StringBuilder();
            for (byte b : bytes) {
                lineCipher.append(String.format("%02X", b));
            }
        }catch (NoSuchAlgorithmException e) {
            logger.error("Method setCipherString... Error build CipherString... line: " + line);
            logger.error(e);
        }
        return lineCipher.toString();
    }
}
