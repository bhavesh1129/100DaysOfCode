import java.util.Scanner;

public class Qns4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfDiscs=sc.nextInt();
        int towerFirst=sc.nextInt();
        int towerSecond=sc.nextInt();
        int towerThird=sc.nextInt();

        towerOfHanoi(numberOfDiscs,towerFirst,towerSecond,towerThird);
    }

    private static void towerOfHanoi(int numberOfDiscs, int towerFirst, int towerSecond, int towerThird) {
        if(numberOfDiscs==0){
            return;
        }
        
        towerOfHanoi(numberOfDiscs-1, towerFirst, towerThird, towerSecond);
        System.out.println(numberOfDiscs+ "[" + towerFirst + " -> " + towerSecond + "]");
        towerOfHanoi(numberOfDiscs-1, towerThird, towerSecond, towerFirst);
    }
}