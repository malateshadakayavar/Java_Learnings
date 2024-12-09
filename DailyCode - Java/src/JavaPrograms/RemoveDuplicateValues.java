package JavaPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateValues {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");
        String input = sc.nextLine();

        String[] inputArray = input.split(" ");

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String numStr : inputArray) {
            try {
                int number = Integer.parseInt(numStr);
                uniqueNumbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numStr + " is not a valid integer.");
            }
        }

        System.out.println("Unique integers are: " + uniqueNumbers);

        sc.close();

    }
}
