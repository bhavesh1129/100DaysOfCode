//Digit Frequency
package day5;

import java.util.Scanner;

public class Qns5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int s_no=sc.nextInt();
		digitFrequency(n,s_no);	
	}

	public static void digitFrequency(long n, int s_no) {
		int count=0;
		while(n!=0) {
			int a=(int)(n%10);
			if(s_no==a) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
