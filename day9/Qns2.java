//Rotate A Matrix by 90Degree in Clockwise Direction
package day9;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int orderOfMatrix=sc.nextInt();
		int[][] arr= new int[orderOfMatrix][orderOfMatrix];
		
		for (int i = 0; i < orderOfMatrix; i++) {
			for (int j = 0; j < orderOfMatrix; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		rotateTheMatrix(arr,orderOfMatrix);
	}

	private static void rotateTheMatrix(int[][] arr, int orderOfMatrix) {
		
		for (int i = 0; i < orderOfMatrix; i++) {
			for (int j = orderOfMatrix-1; j >= 0; j--) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}	
	}
}
