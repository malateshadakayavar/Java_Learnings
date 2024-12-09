package JavaPrograms;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week");

        String day = sc.nextLine().trim();
        sc.close();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
            case "Sunday":
                System.out.println("The day entered is : " + day);
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
                break;
        }
    }
}
