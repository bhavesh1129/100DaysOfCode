//2d Arrays Demo
package day8;

import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfRows=sc.nextInt();
		int numberOfColumns=sc.nextInt();
		int[][] arr= new int[numberOfRows][numberOfColumns];
		
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		printing2DArray(arr,numberOfRows,numberOfColumns);
	}

	private static void printing2DArray(int[][] arr, int numberOfRows, int numberOfColumns) {
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
