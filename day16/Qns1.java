//Get Subsequence Using Recursion
import java.util.*;

public class Qns1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        ArrayList<String> result=getSequence(string);
        System.out.print(result+" ");
    }

    private static ArrayList<String> getSequence(String string) {
        if(string.length()==0){
            ArrayList<String> baseCondition=new ArrayList<>();
            baseCondition.add("");
            return baseCondition;
        }
        char firstCharacter=string.charAt(0);
        String remainingString=string.substring(1);

        ArrayList<String> subSequence=getSequence(remainingString);
        ArrayList<String> finalSubsequence=new ArrayList<>();
        for (String mainResult : subSequence) {
            finalSubsequence.add(""+mainResult);
        }
        for (String mainResult : subSequence) {
            finalSubsequence.add(firstCharacter+mainResult);
        }
        return finalSubsequence;
    }
}