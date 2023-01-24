import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger n = new BigInteger(scan.nextLine());
        int length = n.toString().length();

        if (length <= 100) {
            if (n.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
