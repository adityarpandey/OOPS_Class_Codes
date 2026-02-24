package concepts.CollectionConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {


    public static String normalize(String text){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < text.length() ; i++ ){

            char c = text.charAt(i);

            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }
        }

        return stringBuilder.toString();

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String paragraph = scanner.nextLine();

        String normalizedText = normalize(paragraph);

        String[] words = normalizedText.split(" ");

        HashMap<String , Integer> map = new HashMap<>();

        for(String word : words){

            if(!word.isEmpty()){
                map.put(word,map.getOrDefault(word , 0) + 1);
            }
        }

        String mostFrequentWord = null;
        int maxFrequency = 0;

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrequency){
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        if (mostFrequentWord != null) {
            System.out.println("Most frequent word: \"" + mostFrequentWord + "\" with frequency: " + maxFrequency);
        } else {
            System.out.println("No valid words found in the input.");
        }
        scanner.close();
    }
}

