//Shell Rotate of A Matrix
package day10;

import java.util.Scanner;

public class Qns1 {
	
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
		int numberOfRows=sc.nextInt();
		int numberOfColumns=sc.nextInt();
		int[][] arr= new int[numberOfRows][numberOfColumns];
		
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int shellNumber=sc.nextInt();
		int totalRotation=sc.nextInt();
		shellRotateOfMatrix(arr,shellNumber,totalRotation);
    }
    	private static void shellRotateOfMatrix(int[][] arr, int shellNumber, int totalRotation) {
		int[] oneDArray=fillArrayFromShell(arr,shellNumber);
		rotate(oneDArray,totalRotation);
		fillShellFromArray(arr,shellNumber,oneDArray);
	}

	private static int[] fillArrayFromShell(int[][] arr, int shellNumber) {
		int minRow=shellNumber-1;
		int minColumn=shellNumber-1;
		int maxRow=arr.length-1;
		int maxColumn=arr[0].length-1;
		int size=2*(maxRow-minRow+maxColumn-minColumn);
		int[] oneDArray=new int[size];
		
		int index=0;
		for(int i=minRow,j=minColumn;i<=maxRow;i++) {//left
			oneDArray[index]=arr[i][j];
			index++;
		}

		for(int i=maxRow,j=minColumn+1;j<=maxColumn;j++) {//bottom
			oneDArray[index]=arr[i][j];
			index++;
		}

		for(int i=maxRow-1,j=maxColumn;i>=minRow;i--) {//right
			oneDArray[index]=arr[i][j];
			index++;
		}

		for(int i=minRow,j=maxColumn-1;j>=minColumn+1;j--) {//top
			oneDArray[index]=arr[i][j];
			index++;
		}
		return oneDArray;
	}

	private static void fillShellFromArray(int[][] arr, int shellNumber, int[] oneDArray) {
		int minRow=shellNumber-1;
		int minColumn=shellNumber-1;
		int maxRow=arr.length-1;
		int maxColumn=arr[0].length-1;
		
		int index=0;
		for(int i=minRow,j=minColumn;i<=maxRow;i++) {//left
			arr[i][j]=oneDArray[index];
			index++;
		}

		for(int i=maxRow,j=minColumn+1;j<=maxColumn;j++) {//bottom
			arr[i][j]=oneDArray[index];
			index++;
		}

		for(int i=maxRow-1,j=maxColumn;i>=minRow;i--) {//right
			arr[i][j]=oneDArray[index];
			index++;
		}

		for(int i=minRow,j=maxColumn-1;j>=minColumn+1;j--) {//top
			arr[i][j]=oneDArray[index];
			index++;
		}
	}

	private static void rotate(int[] arr, int totalRotation) {
		totalRotation=totalRotation%arr.length;
		if(totalRotation<0) {
			totalRotation=totalRotation+arr.length;
		}
		reverse(arr,0,arr.length-totalRotation-1);
		reverse(arr,arr.length-totalRotation,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	private static void reverse(int[] arr,int leftIndex, int rightIndex) {
		while(leftIndex<rightIndex) {
			int temp=arr[leftIndex];
			arr[leftIndex]=arr[rightIndex];
			arr[rightIndex]=temp;
		}
		leftIndex++;
		rightIndex--;
	}

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
