//Rotate A Matrix by 90Degree
package day9;

import java.util.Scanner;

public class Qns2 {

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
		rotateTheMatrix(arr,numberOfRows,numberOfColumns);
	}

	private static void rotateTheMatrix(int[][] arr, int numberOfRows, int numberOfColumns) {
		
	}
}
