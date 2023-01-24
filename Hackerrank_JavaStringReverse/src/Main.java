import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isPalindrome();

    }

    public static void isPalindrome(){

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String wordReversed = "";

        if (word.length() > 50) {
            System.out.println("Wrong");
        }

        for (int i = 0; i < word.length(); i++)
            wordReversed = word.charAt(i) + wordReversed;

        if (word.equals(wordReversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
