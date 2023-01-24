public class Main {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        System.out.println(firstString.length() + secondString.length());
        System.out.println(firstString.compareTo(secondString) > 0 ? "Yes" : "No");

        String firstCap = firstString.substring(0, 1).toUpperCase() + firstString.substring(1);
        String secondCap = secondString.substring(0, 1).toUpperCase() + secondString.substring(1);

        System.out.println(firstCap + " " + secondCap);
    }
}
