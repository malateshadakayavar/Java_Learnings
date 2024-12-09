package JavaPrograms;

import java.util.Scanner;

public class CountOfWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        String[] arrayString = str.split("\\s");
        int count = arrayString.length;

        System.out.println("The count is :" + count);



    }
}
