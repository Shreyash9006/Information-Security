
import java.security.MessageDigest;
import java.util.Scanner;

public class MD5Example {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(message.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();

        for (byte b : digest) {
            hexString.append(String.format("%02x", b & 0xff));
        }

        System.out.println("MD5 Hash: " + hexString);

        sc.close();
    }
}
