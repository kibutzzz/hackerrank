package challenges.java;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMd5 {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        MessageDigest digest = MessageDigest.getInstance("MD5");

        byte[] hash = digest.digest(input.getBytes("UTF-8"));

//        System.out.println(DatatypeConverter.printHexBinary(hash).toLowerCase());

    }
}
