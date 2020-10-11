//Matrix Multiplication
package day8;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int RowsOfFirstMatrix=sc.nextInt();
		int ColumnsOfFirstMatrix=sc.nextInt();
		int[][] arr1= new int[RowsOfFirstMatrix][ColumnsOfFirstMatrix];
		
		for (int i = 0; i < RowsOfFirstMatrix; i++) {
			for (int j = 0; j < ColumnsOfFirstMatrix; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int RowsOfSecMatrix=sc.nextInt();
		int ColumnsOfSecMatrix=sc.nextInt();
		int[][] arr2= new int[RowsOfSecMatrix][ColumnsOfSecMatrix];
		
		for (int i = 0; i < RowsOfSecMatrix; i++) {
			for (int j = 0; j < ColumnsOfSecMatrix; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		matrixMultiplication(arr1,RowsOfFirstMatrix,ColumnsOfFirstMatrix,arr2,RowsOfSecMatrix,ColumnsOfSecMatrix);
	}

	private static void matrixMultiplication(int[][] arr1,int rowsOfFirstMatrix, int columnsOfFirstMatrix, int[][] arr2, int rowsOfSecMatrix, int columnsOfSecMatrix) {
		
		if(columnsOfFirstMatrix!=rowsOfSecMatrix) {
			System.out.print("invalid output");
			return;
		}
		
		int[][] mulOfMatrix=new int[rowsOfFirstMatrix][columnsOfSecMatrix];
		
		for (int i = 0; i < rowsOfFirstMatrix; i++) {
			for (int j = 0; j < columnsOfSecMatrix; j++) {
				for (int k = 0; k < rowsOfSecMatrix; k++) {
					mulOfMatrix[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		for (int i = 0; i < rowsOfFirstMatrix; i++) {
			for (int j = 0; j < columnsOfSecMatrix; j++) {
				System.out.print(mulOfMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
