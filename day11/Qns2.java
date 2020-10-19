//Search In A Sorted 2d Array
package day11;

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
		int searchedElement=sc.nextInt();
		searchInSorted2DArray(arr,orderOfMatrix,searchedElement);
	}

	private static void searchInSorted2DArray(int[][] arr, int orderOfMatrix, int searchedElement) {
		boolean flag=false;
		int rowIndex=0;
		int columnIndex=0;
		for (int i = 0; i < orderOfMatrix; i++) {
			for (int j = 0; j < orderOfMatrix; j++) {
				if(searchedElement==arr[i][j]) {
					rowIndex=i;
					columnIndex=j;
					flag=true;
				}
			}
		}
		if(flag==true) {
			System.out.print(rowIndex+"\n"+columnIndex);
		}else {
			System.out.println("Not Found");
		}
	}
}
