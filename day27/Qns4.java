//Climb Stairs
import java.util.*;

public class Qns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = climbStairs(number,new int[number + 1]);
        System.out.print(result);
    }

    private static int climbStairs(int number, int[] store) {
        if(number == 0){
            return 1;
        }else if(number < 0){
            return 0;
        }
        if(store[number] > 0){
            return store[number];
        }

        int climb1 = climbStairs(number - 1, store);
        int climb2 = climbStairs(number - 2, store);
        int climb3 = climbStairs(number - 3, store);
        int climbCount = climb1 + climb2 + climb3;
        store[number] = climbCount;
        return climbCount;
    }
}
