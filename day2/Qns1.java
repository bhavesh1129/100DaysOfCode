//Prime Number
package day2;

import java.util.Scanner;

public class Qns1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int count=0;
			for(int j=2;j*j<=n;j++) {
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
		}
	}
}
