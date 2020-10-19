//Saddle Point
package day11;

import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int orderOfMatrix=sc.nextInt();
		int[][] arr= new int[orderOfMatrix][orderOfMatrix];
		
		for (int i = 0; i < orderOfMatrix; i++) {
			for (int j = 0; j < orderOfMatrix; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		saddlePointInAMatrix(arr);
	}

	private static void saddlePointInAMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minimum=0;
			for (int j = 1; j < arr[0].length; j++) {
				if(arr[i][j]<arr[i][minimum]) {
					minimum=j;
				}
			}
			boolean flag=true;
			for (int k = 0; k < arr.length; k++) {
				if(arr[k][minimum]>arr[i][minimum]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(arr[i][minimum]);
				return;
			}
		}
		System.out.println("Invalid input");
	}
}
