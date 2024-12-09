package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfWordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write a sentence :");

        String sentence = sc.nextLine().trim();

        String[] words = sentence.toLowerCase().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {

            word = word.replaceAll("[^a-zA-Z]", "");

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
