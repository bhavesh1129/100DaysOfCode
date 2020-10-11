//Any Base to Decimal
package day5;

import java.util.Scanner;

public class Qns7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base=sc.nextInt();
		baseToAnyDecimal(n,base);
	}

	public static void baseToAnyDecimal(int n, int base) {
		int r_value=0;
		int pow=0;
		while(n>0) {
			int digit=n%10;
			r_value+=digit*Math.pow(base, pow);
			n=n/10;
			pow++;
		}
		System.out.print(r_value);
	}
}
