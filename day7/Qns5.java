//First Index And Last Index
package day7;

import java.util.Scanner;

public class Qns5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr= new int[numberOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		numberRepresentingFirstIndex(arr,element);
		System.out.println();
		numberRepresentingLastIndex(arr,element);
	}

	private static void numberRepresentingLastIndex(int[] arr, int element) {
		int lowestNumber=0;
		int highestNumber=arr.length-1;
		int midNumber;
		int lastIndex=-1;
		while(lowestNumber<=highestNumber) {
			midNumber=(lowestNumber+highestNumber)/2;
			if(element>arr[midNumber]) {
				lowestNumber=midNumber+1;
			}else if(element<arr[midNumber]) {
				highestNumber=midNumber-1;
			}else {
				lastIndex=midNumber;
				lowestNumber=midNumber+1;
			}
		}
		System.out.print(lastIndex);
	}

	private static void numberRepresentingFirstIndex(int[] arr, int element) {
		int lowestNumber=0;
		int highestNumber=arr.length-1;
		int midNumber;
		int firstIndex=-1;
		while(lowestNumber<=highestNumber) {
			midNumber=(lowestNumber+highestNumber)/2;
			if(element>arr[midNumber]) {
				lowestNumber=midNumber+1;
			}else if(element<arr[midNumber]) {
				highestNumber=midNumber-1;
			}else {
				firstIndex=midNumber;
				highestNumber=midNumber-1;
			}
		}
		System.out.print(firstIndex);
	}
}
