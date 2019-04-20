import java.io.*;
import java.util.*;
import java.lang.*;

class Ceaser {
    public static void main(String[] ar){
        String PT = "hello";
        Character key = 'l';
        String CT = encode(PT, key);
        System.out.println("Encipher: "+CT);
        decode(CT, key);
        String DT = decode(CT, key);
        System.out.println("Decipher: "+DT);
    }

    public static String encode(String PT, Character key){
        StringBuilder CT = new StringBuilder();
        int keyn = (int)(key - 'a');
        for(int i=0; i<PT.length(); i++){
            int temp = (int) (PT.charAt(i)-'a');
            CT.append((char)('a'+(temp+keyn)%26));
        }
        return CT.toString();
    }

    public static String decode(String CT, Character key){
        StringBuilder DT = new StringBuilder();
        int keyIn = 26 - (int)(key-'a');
        for(int i=0; i<CT.length(); i++){
            int temp = (int)(CT.charAt(i)-'a');
            DT.append((char)('a'+(temp+keyIn)%26));
        }
        return DT.toString();
    }
}