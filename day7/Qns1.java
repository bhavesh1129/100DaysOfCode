//SubArrays
package day7;

import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr= new int[numberOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		subArrays(arr);
	}

	private static void subArrays(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}
