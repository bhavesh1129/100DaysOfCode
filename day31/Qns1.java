//String Is A Valid Shuffle of Two Other Strings
import java.util.*;

public class Qns1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String[] result = new String[2];
        for (int i = 0; i < result.length; i++) {
            result[i] = sc.next();
        }
        for(String res : result){
            if(shuffleCheck(str1,str2,res) == true){
                System.out.println("Valid Shuffle");
            }else{
                System.out.println("Invalid Shuffle");
            }
        }
    }

    private static boolean shuffleCheck(String str1, String str2, String res) {
        if(str1.length() + str2.length() != res.length()){
            return false;
        }
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while(index3 != res.length()){
            if(index1 < str1.length() && str1.charAt(index1) == res.charAt(index3)){
                index1++;
            }else if(index2 < str2.length() && str2.charAt(index2) == res.charAt(index3)){
                index2++;
            }else{
                return false;
            }
            index3++;
        }

        if(index1 < str1.length() || index2 < str2.length()){
            return false;
        }
        return true;
    }
}
