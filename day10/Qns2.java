//Diagonal Traversal
package day10;

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
		diagonalTraversalOfMatrix(arr);
	}

	private static void diagonalTraversalOfMatrix(int[][] arr) {
		for (int indexGap = 0; indexGap < arr.length; indexGap++) {
			for (int row = 0,column = indexGap; column < arr.length; column++,row++) {
				System.out.println(arr[row][column]+" ");
			}
		}
	}
}
