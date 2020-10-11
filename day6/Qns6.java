//Reverse of Array
package day6;

import java.util.Scanner;

public class Qns6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		reverseAnArray(arr);
	}

	public static void reverseAnArray(int[] arr) {
		for(int i=arr.length;i>0;i--) {
			System.out.print(i+" ");
		}
	}
}
