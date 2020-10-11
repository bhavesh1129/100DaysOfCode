//Fibonacci Numbers
package day2;

import java.util.Scanner;

public class Qns3 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(0+"\n"+1);
		for(int i=0;i<n-2;i++) {
			temp=b;
			b=a+b;
			System.out.println(b);
			a=temp;
		}
	}
}
