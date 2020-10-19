//Get KPC Using Recursion
import java.util.*;

public class Qns2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();

        String[] codes={ ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        ArrayList<String> result=getKeypadComination(string,codes);

        System.out.print(result+" ");
    }

    private static ArrayList<String> getKeypadComination(String string, String[] codes) {
        if(string.length()==0){
            ArrayList<String> baseCondition=new ArrayList<>();
            baseCondition.add("");
            return baseCondition;
        }
        char firstCharacter=string.charAt(0);
        String remainingString=string.substring(1);

        ArrayList<String> keypadCombo=getKeypadComination(remainingString, codes);
        ArrayList<String> mainResult=new ArrayList<>();

        String character=codes[firstCharacter-'0'];

        for (int i = 0; i < character.length(); i++) {
            char characterAtFirstPlace=character.charAt(i);
            for (String combinations : keypadCombo) {
                mainResult.add(characterAtFirstPlace+combinations);
            }
        }
        return mainResult;
    }
}