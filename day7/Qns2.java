//Subset Of An Array
package day7;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr= new int[numberOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		subsetsOfArray(arr);
	}

	private static void subsetsOfArray(int[] arr) {
		int count=(int)Math.pow(2, arr.length);
		for (int i = 0; i < count; i++) {
			String set="";
			int temp=i;
			for (int j = arr.length-1; j >=0; j--) {
				int remainder=temp%2;
				temp=temp/2;
				if(remainder==0) {
					set="-"+set;
				}else {
					set=arr[j]+set;
				}
			}
			System.out.println(set);
		}
	}
}
