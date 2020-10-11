//Spiral Display
package day8;

import java.util.Scanner;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfRows=sc.nextInt();
		int numberOfColumns=sc.nextInt();
		int[][] arr=new int[numberOfRows][numberOfColumns];
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sprialDisplayOfMatrix(arr,numberOfRows,numberOfColumns);
	}

	private static void sprialDisplayOfMatrix(int[][] arr, int numberOfRows, int numberOfColumns) {
		int minRow=0;
		int maxRow=numberOfRows-1;
		int minColumn=0;
		int maxColumn=numberOfColumns-1;
		int totalElementsInMatrix=numberOfRows*numberOfColumns;
		int count=0;
		while(count<totalElementsInMatrix) {
			//left side
			for(int i=minRow,j=minColumn;i<=maxRow&&count<totalElementsInMatrix;i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minColumn++;
			
			//bottom side
			for(int i=maxRow,j=minColumn;j<=maxColumn&&count<totalElementsInMatrix;j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxRow--;
			
			//right side
			for(int i=maxRow,j=maxColumn;i>=minRow&&count<totalElementsInMatrix;i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxColumn--;
			
			//top side
			for(int i=minRow,j=maxColumn;j>=minColumn&&count<totalElementsInMatrix;j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minRow++;
		}
	}
}