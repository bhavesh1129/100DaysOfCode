//Any Base Multiplication
package day5;

import java.util.Scanner;

public class QNSS11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int d1 = 0;
		int result=anyBaseMultiplication(base,n1,n2);
		System.out.println(result);
	}

	public static int anyBaseMultiplication(int base, int n1, int n2) {
		int r_value=0;
		int pow=1;
		while(n2>0) {
			int d2=n2%10;
			n2=n2/10;
			int prod=baseMultiplicationWithSingleDigit(base,n1,d2);
			r_value=anyBaseAddition(base,r_value,prod*pow);
			pow=pow*10;
		}
		return r_value;
	}
	
	private static int baseMultiplicationWithSingleDigit(int base, int n1, int d2) {
		int r_val=0;
		int c=0;
		int pow=1;
		while(n1>0||c>0) {
			int d1=n1%10;
			n1=n1/10;
			int d=d1*d2+c;
			c=d/base;
			d=d%base;
			r_val+=d*pow;
			pow=pow*10;
		}
		return r_val;	
	}
	
	public static int anyBaseAddition(int base, int n1, int n2) {
		int pow=1;
		int r_value=0;
		int carry=0;
		while(n1>0 || n2>0 ||carry>0) {
			int dig1=n1%10;
			int dig2=n2%10;
			n1=n1/10;
			n2=n2/10;
			
			int sum=dig1+dig2+carry;
			carry=sum/base;
			sum=sum%base;
			r_value+=sum*pow;
			pow=pow*10;
		}
		return r_value;
	}
}
