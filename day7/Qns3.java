//Binary Search
package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Qns3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr= new int[numberOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int searchedElement=sc.nextInt();
		binarySearch(arr,searchedElement);
	}

	private static void binarySearch(int[] arr,int searchedElement) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int lowestNumber=0;
			int highestNumber=arr.length-1;
			while(lowestNumber<=highestNumber) {
				int midNumber=(lowestNumber+highestNumber)/2;
				if(searchedElement>arr[midNumber]) {
					lowestNumber=midNumber+1;
				}else if(searchedElement<arr[midNumber]) {
					highestNumber=midNumber-1;
				}else {
					System.out.print("Number is found");
					return;
				}
			}
		}
		System.out.print("Number isn't found");
	}
}
