import java.io.*;
import java.util.*;
import java.lang.*;

class Multiplicative {
    public static void main(String[] ar) {
        String PT = "HELLO";
        Character key = 'J';
        String CT = encode(PT, key);
        System.out.println("Encipher: " + CT);
        String DT = decode(CT, key);
        System.out.println("Decipher: " + DT);
    }

    public static String encode(String PT, Character key) {
        StringBuilder CT = new StringBuilder();
        int keyn = (int) (key - 'A');
        for (int i = 0; i < PT.length(); i++) {
            int temp = (int) (PT.charAt(i) - 'A');
            CT.append((char) ('A' + (temp * keyn) % 26));
        }
        return CT.toString();
    }

    public static String decode(String CT, Character key) {
        StringBuilder DT = new StringBuilder();
        int keyIn = getModularInverse(key);
        for (int i = 0; i < CT.length(); i++) {
            int temp = (int) (CT.charAt(i) - 'A');
            DT.append((char) ('A' + (temp * keyIn) % 26));
        }
        return DT.toString();
    }

    public static int getModularInverse(Character key) {
        int keyn = (int) (key - 'A');
        for (int i = 0; i <= 26; i++) {
            if ((keyn * i) % 26 == 1)
                return i;
        }
        System.out.println("Modular Inverse does not exists, try different key");
        System.exit(0);
        return 0;
    }
}