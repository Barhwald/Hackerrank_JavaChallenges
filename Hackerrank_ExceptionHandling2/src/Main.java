import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        while (myScanner.hasNextInt()) {
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();

            try {
                MyCalculator myCalc = new MyCalculator();
                System.out.println(myCalc.power(x, y));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
