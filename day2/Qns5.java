//Reverse A Number
package day2;

import java.util.Scanner;

public class Qns5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a,rev=0;
		while(n>0) {
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println(rev);
	}
}
