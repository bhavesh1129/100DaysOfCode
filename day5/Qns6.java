//Decimal To Any Base
package day5;

import java.util.Scanner;

public class Qns6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base=sc.nextInt();
		decimalToAnyBase(n,base);
	}

	public static void decimalToAnyBase(int n, int base) {
		int pow=1;
		int r_val = 0;
		while(n>0) {
			int digit=n%base;
			n=n/base;
			r_val+=digit*pow;
			pow=pow*10;
		}
		System.out.print(r_val);
	}
}
