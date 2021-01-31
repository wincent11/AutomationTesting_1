package selections;

public class Selections {
    public static void verifyPalindrome(String word){
        char[] charactersArray = word.toLowerCase().toCharArray();
        int count=0;
        for (int i = 0; i < charactersArray.length; i++) {
            if (charactersArray[i]!=charactersArray[charactersArray.length-i-1]){
                count++;
            }
        }
        if (count!=0){
            System.out.println(word+" isn't a palindrome");
        }else{
            System.out.println(word+" is a palindrome");
        }
    }
}
