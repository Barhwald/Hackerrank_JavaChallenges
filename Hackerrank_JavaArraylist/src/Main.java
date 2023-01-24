import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int numOfLines = Integer.parseInt(myScanner.nextLine());
        List<List<Integer>> valuesLists = new ArrayList<>();
        List<List<Integer>> indicesLists = new ArrayList<>();

        for (int i = 0; i < numOfLines; i++){
            List<Integer> valuesList = new ArrayList<>();
            String[] numbersAsString = myScanner.nextLine().split(" ");

            for (int j = 0; j < numbersAsString.length; j++) {
                valuesList.add(j, Integer.parseInt(numbersAsString[j]));
            }
            valuesLists.add(valuesList);
        }
        int nextNumOfLines = Integer.parseInt(myScanner.nextLine());

        for (int k = 0; k < nextNumOfLines; k++) {
            List<Integer> indicesList = new ArrayList<>();
            String[] numbersAsString = myScanner.nextLine().split(" ");

            for (int j = 0; j < numbersAsString.length; j++) {
                indicesList.add(j, Integer.parseInt(numbersAsString[j]));
            }
            indicesLists.add(indicesList);
        }

        for (List<Integer> indicesList : indicesLists) {
            try {
                int a = indicesList.get(0);
                int b = indicesList.get(1);
                System.out.println(valuesLists.get(a - 1).get(b));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
