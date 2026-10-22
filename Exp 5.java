
import java.math.BigInteger;
import java.util.Scanner;

public class RSAAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose two prime numbers
        BigInteger p = BigInteger.valueOf(61);
        BigInteger q = BigInteger.valueOf(53);

        // Calculate n and phi(n)
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)
                          .multiply(q.subtract(BigInteger.ONE));

        // Choose public exponent e
        BigInteger e = BigInteger.valueOf(17);

        // Calculate private exponent d
        BigInteger d = e.modInverse(phi);

        System.out.print("Enter a numeric message (0 to "
                         + n.subtract(BigInteger.ONE) + "): ");
        BigInteger message = sc.nextBigInteger();

        if (message.signum() < 0 || message.compareTo(n) >= 0) {
            System.out.println("Message must be between 0 and "
                               + n.subtract(BigInteger.ONE));
            sc.close();
            return;
        }

        // Encryption: C = M^e mod n
        BigInteger encrypted = message.modPow(e, n);

        // Decryption: M = C^d mod n
        BigInteger decrypted = encrypted.modPow(d, n);

        System.out.println("\nRSA Parameters:");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("n = " + n);
        System.out.println("phi(n) = " + phi);
        System.out.println("Public Key (e, n) = (" + e + ", " + n + ")");
        System.out.println("Private Key (d, n) = (" + d + ", " + n + ")");

        System.out.println("\nOriginal Message: " + message);
        System.out.println("Encrypted Message: " + encrypted);
        System.out.println("Decrypted Message: " + decrypted);

        sc.close();
    }
}
