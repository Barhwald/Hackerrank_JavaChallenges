import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();

        if (n >= -100 && n <= 100) {
            try {
                String s = Integer.toString(n);
                System.out.println("Good job");
            } catch (Exception e) {
                System.out.println("Wrong answer");
            }
        } else {
            System.out.println("Wrong answer");
        }

    }

}
