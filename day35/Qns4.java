import java.io.*;
import java.util.*;

public class Qns4{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] newArray = solve(a);
    display(newArray);
 }

 public static int[] solve(int[] arr){
   int[] newArray = new int[arr.length];
   Stack<Integer> st = new Stack<>();
   st.push(0);
   newArray[0] = 1;
   for (int i = 1; i < arr.length; i++) {
       while(st.size() > 0 && arr[i] > arr[st.peek()]){
           st.pop();
       }
       if(st.size() == 0){
           newArray[i] = 1 + 1;
       }else{
        newArray[i] = i - st.peek();
       }
       st.push(i);
   }
   return newArray;
 }
}