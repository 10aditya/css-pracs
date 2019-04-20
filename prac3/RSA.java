import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class RSA {

    static int gcd(int x, int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }

    public static void main(String ar[]){
        BigInteger p,q,n,phi,e,d;
        int i;
        System.out.println("Enter P: ");
        Scanner sc = new Scanner(System.in);
        p=sc.nextBigInteger();
        System.out.println("Enter Q: ");
        q=sc.nextBigInteger();
        n=p.multiply(q);
        e = new BigInteger("2");
        phi = p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1")));
        for(i=2; i<phi.intValue(); i++){
            if(gcd(i,phi.intValue())==1){
                e = new BigInteger(String.valueOf(i));
                break;
            }
        }
        d = e.modInverse(phi);
        System.out.println("Public Key: "+e.toString()+", "+n.toString());
        System.out.println("Private Key: "+d.toString());
        System.out.print("Enter a message: ");
        BigInteger msg = sc.nextBigInteger();
        BigInteger cipher = msg.modPow(e, n);
        System.out.println("Encrypted Message: "+cipher);
        BigInteger decipher = cipher.modPow(d, n);
        System.out.println("Decrypted Message: "+decipher);
    }
}