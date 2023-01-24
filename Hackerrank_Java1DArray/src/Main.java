import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

//        System.out.print("Enter array length: ");
        int length = myScanner.nextInt();
        int[] userArray = new int[length];
        for (int i = 0; i < length; i++) {
            int temp = myScanner.nextInt();
            userArray[i] = temp;
        }
        for (int element : userArray) {
            System.out.println(element);
        }
    }
}
