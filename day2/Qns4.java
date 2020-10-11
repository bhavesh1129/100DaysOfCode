//Count Number of Digits
package day2;

import java.util.Scanner;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,count=0;
		while(n>0) {
			a=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
