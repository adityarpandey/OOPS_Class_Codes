package concepts.CollectionConcept;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetImplimentation {
    public void uniqueNamesApp() {

        HashSet<String> unique = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            unique.add(scanner.nextLine());
        }

        // Display the names in the HashSet
        System.out.println("Unique Names:");

        for(String s : unique){
            System.out.println(s);
        }
    }
}
