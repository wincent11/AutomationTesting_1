package loops;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Loops {
    private static final ArrayList<String> VOWELS = new ArrayList<String>(Arrays.asList("A", "E", "I", "O", "U"));

    public static void countVowels(String statement){
        char[] charactersArray = statement.toLowerCase().toCharArray();
        int count=0;
        for (int i = 0; i < VOWELS.size(); i++) {
            for (int j = 0; j < charactersArray.length; j++) {
                if (String.valueOf(charactersArray[j]).toUpperCase().equals(VOWELS.get(i))){
                    count++;
                }
            }
        }
        System.out.println(statement);
        System.out.println("The numbers of vowels is:"+count);
    }
}
