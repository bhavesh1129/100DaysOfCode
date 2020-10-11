package day5;

import java.util.Scanner;

public class Qns8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int base1=sc.nextInt();
		int base2=sc.nextInt();
		baseToAnyBase(n,base1,base2);
	}

	public static void baseToAnyBase(int n, int base1, int base2) {
		int r1_value=0;
		int pow1=0;
		while(n>0) {
			int digit1=n%10;
			r1_value+=digit1*Math.pow(base1, pow1);
			n=n/10;
			pow1++;
		}
		int r2_value=r1_value;
		int r3_value=0;
		int pow2=1;
		while(r2_value>0) {
			int digit2=r2_value%base2;
			r2_value/=base2;
			r3_value+=digit2*pow2;
			pow2=pow2*10;
		}
		System.out.println(r3_value);
	}
}
