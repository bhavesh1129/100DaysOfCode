//GCD and LCM
package day3;

import java.util.Scanner;

public class Qns2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int N1=num1;
		int N2=num2;
		while(num1%num2!=0) {
			int rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		int gcd=num2;
		System.out.println(gcd);
		int lcm=(N1*N2)/gcd;
		System.out.println(lcm);
	}
}
