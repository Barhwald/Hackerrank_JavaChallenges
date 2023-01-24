import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        try {
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();
            System.out.println(x/y);
        } catch (java.util.InputMismatchException BadOutput) {
            System.out.println("java.util.InputMismatchException");
        } catch (java.lang.ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        myScanner.close();
    }
}
