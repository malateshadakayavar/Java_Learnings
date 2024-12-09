package JavaPrograms;

import java.util.Scanner;

public class InputOfTwoNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        if(a<b){
            System.out.println("The largest number is :" + b);
        }
        else{
            System.out.println("The largest number is :" + a);
        }

    }
}
