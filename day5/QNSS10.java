//Any Base Subtraction
package day5;

import java.util.Scanner;

public class QNSS10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		baseSubtraction(base,n1,n2);
	}

	public static void baseSubtraction(int base, int n1, int n2) {
		int r_value=0;
		int pow=1;
		int carry=0;
		while(n2>0) {
			int dig1=n1%10;
			int dig2=n2%10;
			n1=n1/10;
			n2=n2/10;
			
			int f_dig=0;
			dig2=dig2+carry;
			
			if(dig2>=dig1) {
				carry=0;
				f_dig=dig2-dig1;
			}else {
				carry=-1;
				f_dig=dig2+base-dig1;
			}
			r_value+=f_dig*pow;
			pow=pow*10;
		}
		System.out.println(r_value);
	}
}
