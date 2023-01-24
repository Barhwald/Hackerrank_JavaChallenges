import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] parts = s.split("[!,?._'@ ]");

        System.out.println(parts.length);
        for (String a : parts) {
            System.out.println(a);
        }
    }

}
