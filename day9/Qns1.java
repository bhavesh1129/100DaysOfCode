//Exit Point Of A Matrix
package day9;

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
		exitPointOfMatrix(arr,numberOfRows,numberOfColumns);
	}

	private static void exitPointOfMatrix(int[][] arr, int numberOfRows, int numberOfColumns) {
		int direction=0;
		numberOfColumns=0;
		numberOfRows=0;
		
		while(true) {
			direction=(direction+arr[numberOfRows][numberOfColumns])%4;
			if(direction==0) {//East Direction
				numberOfColumns++;
			}else if(direction==1) {//South Direction
				numberOfRows++;
			}else if(direction==2) {//West Direction
				numberOfColumns--;
			}else if(direction==3) {//North Direction
				numberOfRows--;
			}
			if(numberOfRows<0) {
				numberOfRows++;
				break;
			}else if(numberOfColumns<0) {
				numberOfColumns++;
				break;
			}else if(numberOfRows==arr.length) {
				numberOfRows--;
				break;
			}else if(numberOfColumns==arr[0].length) {
				numberOfColumns--;
				break;
			}
		}
		System.out.println(numberOfRows);
		System.out.print(numberOfColumns);
	}
}
