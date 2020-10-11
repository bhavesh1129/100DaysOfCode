//Sum Of Two Arrays
package day6;

import java.util.Scanner;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int[] a2=new int[n2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=sc.nextInt();
		}
		sumOfTwoArray(a1,n1,a2,n2);
	}

	public static void sumOfTwoArray(int[] a1, int n1, int[] a2, int n2) {
		int sum[]=new int[n1>n2?n1:n2];
		int i=a1.length-1;
		int j=a2.length-1;
		int k=sum.length-1;
		int carry=0;
		while(k>=0) {
			int dig=carry;
			if(i>=0) {
				dig+=a1[i];
			}
			if(j>=0) {
				dig+=a2[j];
			}
			carry=dig/10;
			dig=dig%10;
			sum[k]=dig;
			i--;
			j--;
			k--;
		}
			if(carry!=0) {
				System.out.println(carry);
			}
			for(int val:sum) {
				System.out.println(val);
		}
	}
}
