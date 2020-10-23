//Print KPC
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.next();
        printKeypadPatternCombination(originalString,"");
    }

    private static void printKeypadPatternCombination(String originalString, String leftstring) {
        String[] codes = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        if(originalString.length() == 0){
            System.out.println(leftstring);
            return;
        }
        char character = originalString.charAt(0);
        String remainingString=originalString.substring(1);

        String codeForCharacters=codes[character-'0'];
        for (int i = 0; i < codeForCharacters.length(); i++) {
            char cho=codeForCharacters.charAt(i);
            printKeypadPatternCombination(remainingString, leftstring + cho);
        }
    }
}
