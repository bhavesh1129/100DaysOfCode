//Rotate An Array
package day6;

import java.util.Scanner;

public class Qns7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int rotate=sc.nextInt();
		rotateAnArray(arr,rotate);
		for(int val:arr) {
			System.out.print(val+" ");
		}
	}

	public static void reverseAnArray(int[] arr,int i,int j) {
		int li=i;
		int ri=j;
		while(li<ri) {
			int temp=arr[li];
			arr[li]=arr[ri];
			arr[ri]=temp;
			
			li++;
			ri--;
		}
	}

	public static void rotateAnArray(int[] arr, int rotate) {
		rotate=rotate%arr.length;
		if(rotate<0) {
			rotate+=arr.length;
		}
		reverseAnArray(arr,0,arr.length-rotate-1);
		reverseAnArray(arr,arr.length-rotate,arr.length-1);
		reverseAnArray(arr,0,arr.length-1);
	}
}
