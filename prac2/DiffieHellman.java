import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

class DiffieHellman {
    public static void main(String ar[]){
        BigInteger A,b,B,k1,n,g,k2,a,s,s1;
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n and g:");
        n = scanner.nextBigInteger();
        g = scanner.nextBigInteger();
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        a = g.pow(x);
        A = a.mod(n);
        System.out.println("A is calculated: "+A);
        System.out.println("Enter y: ");        
        y = scanner.nextInt();
        b = g.pow(y);
        B = b.mod(n);
        System.out.println("B is calculated: "+B);
        System.out.println("Calculating key1: ");
        s = B.pow(x);
        k1 = s.mod(n);
        System.out.println("Calculating key2: ");
        s1 = A.pow(y);
        k2 = s1.mod(n);
        System.out.println("Key1: "+ k1);
        System.out.println("Key2: "+ k2);
    }
}