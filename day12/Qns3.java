package day12;

import java.util.Scanner;

public class Qns3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		permutationsOfAString(str);
	}

	private static void permutationsOfAString(String str) {
		int n=str.length();
		int fact=factorial(n);
		
		for (int i = 0; i < fact; i++) {
		    StringBuilder string=new StringBuilder(str);
			int temp=i;
			for (int div = n; div >= 1; div--) {
				int quotient=temp/div;
				int remainder=temp%div;
				
				System.out.print(string.charAt(remainder));
				string.deleteCharAt(remainder);
				temp=quotient;
			}
			System.out.println();
		}
	}

	private static int factorial(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
