//Any Base Addition
package day5;

import java.util.Scanner;

public class Qns9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		anyBaseAddition(base,n1,n2);
	}

	public static void anyBaseAddition(int base, int n1, int n2) {
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
		System.out.println(r_value);
	}
}
