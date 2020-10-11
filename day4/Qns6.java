package day4;

import java.util.Scanner;

public class Qns6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int i,j;
		int str=n/2+1;
		int sp=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=str;j++) {
				System.out.print("*");
			}
			for(j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=str;j++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				str--;
				sp+=2;
			}else {
				str++;
				sp-=2;
			}
			System.out.println();
		}
	}
}
