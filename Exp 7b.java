
import java.security.MessageDigest;
import java.util.Scanner;

public class SHA1Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        byte[] digest = sha.digest(message.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();

        for (byte b : digest) {
            hexString.append(String.format("%02x", b & 0xff));
        }

        System.out.println("SHA-1 Hash: " + hexString);

        sc.close();
    }
}
