import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {

                a = a + (int)Math.pow(2,j) * b;
                System.out.print(a + " ");

            }
            System.out.println();

        }
        sc.close();
    }
}
