import java.io.*;
import java.security.*;
import java.util.*;
import java.security.spec.*;

public class VerSig {

    public static void main(String[] args) {

        /* Verify a DSA signature */
        int ver = 3;
        if (ver == 3) {
            //VerSig result = new VerSig();
            System.out.println(mod(35, 78));
            hashString("h0 there");
        }
    }

    public static int mod(int a, int b) {
        //a is the public, b is the mod
        if (a == 0 || b == 0) {
            return 0;
        }
        int b1 = b + 1;
        while (b1 % a != 0) {
            b1 += b;
        }
        int result = b1 / a;
        return result;
    }

    public static void hashString(String a) {
        StringBuffer hexString = new StringBuffer();
        byte[] bytesOfMessage = null;
        try {
            bytesOfMessage = a.getBytes("UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println("I'm sorry, but MD5 is not a valid message digest algorithm");
        }

        byte[] thedigest = md.digest(bytesOfMessage);
        //int temp = thedigest.length;
        for (int i = 0; i < thedigest.length; i++) {
            if ((0xff & thedigest[i]) < 0x10) {
                hexString.append("0"
                        + Integer.toHexString((0xFF & thedigest[i])));
            } else {
                hexString.append(Integer.toHexString(0xFF & thedigest[i]));
            }
        }
        for(int i = 0; i < thedigest.length; i++){
        System.out.printf(Integer.toHexString(thedigest[i]));

        }
    }
}
