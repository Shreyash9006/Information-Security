
import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Publicly shared values
        BigInteger p = BigInteger.valueOf(23);
        BigInteger g = BigInteger.valueOf(5);

        // Private keys of Alice and Bob
        System.out.print("Enter Alice's private key: ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter Bob's private key: ");
        BigInteger b = sc.nextBigInteger();

        // Calculate public keys
        BigInteger A = g.modPow(a, p);
        BigInteger B = g.modPow(b, p);

        // Calculate shared secret keys
        BigInteger secretAlice = B.modPow(a, p);
        BigInteger secretBob = A.modPow(b, p);

        System.out.println("\nPublic Prime (p): " + p);
        System.out.println("Public Base (g): " + g);
        System.out.println("Alice's Public Key: " + A);
        System.out.println("Bob's Public Key: " + B);

        System.out.println("Alice's Shared Secret: " + secretAlice);
        System.out.println("Bob's Shared Secret: " + secretBob);

        if (secretAlice.equals(secretBob)) {
            System.out.println("Key Exchange Successful!");
        } else {
            System.out.println("Key Exchange Failed!");
        }

        sc.close();
    }
}
