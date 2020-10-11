//Find Element In An Array
package day6;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int elt=sc.nextInt();
		findElementInArray(arr,elt);
	}

	public static void findElementInArray(int[] arr, int elt) {
	    int ind=-1;
	    int i;
		for(i=0;i<arr.length;i++) {
			if(elt==arr[i]) {
			    ind=i;
			    break;
			}
		}
			System.out.println(ind);
	}
}
