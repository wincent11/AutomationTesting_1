package Main;
import elementaryProgramming.ElementaryProgramming;
import loops.Loops;
import methods.Methods;
import selections.Selections;

public class Main {
    public static void main(String[] args) {
        System.out.println(ElementaryProgramming.convertCelsiusToFahrenheit(36.6));

        Loops.countVowels("Programing is awesome!");

        System.out.println(Methods.reverse(1524+1));

        Selections.verifyPalindrome(String.valueOf(12421));
    }
}
