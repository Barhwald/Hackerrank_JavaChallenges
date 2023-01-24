import java.util.Scanner;

public class Main {

    static {
        Scanner myObj = new Scanner(System.in);
        int b = myObj.nextInt();
        int h = myObj.nextInt();

        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    }

    public static void main(String[] args) {

    }

}
