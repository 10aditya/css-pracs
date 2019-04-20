import java.security.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MD5 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string: ");
        String password = sc.nextLine();
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                stringBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hash = stringBuilder.toString();
        } catch (Exception ignored) {
        }
        System.out.println("Hash value: " + hash);
    }
}