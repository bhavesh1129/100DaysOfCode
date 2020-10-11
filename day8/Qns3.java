//Wave Traversal
package day8;

import java.util.Scanner;

public class Qns3 {

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
		waveTraversal(arr,numberOfColumns,numberOfRows);
	}

	private static void waveTraversal(int[][] arr, int numberOfColumns, int numberOfRows) {
		for (int j = 0; j < numberOfColumns; j++) {
			if(j%2==0) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i][j]);
				}
			}else {
				for (int i = arr.length-1; i >=0 ; i--) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
