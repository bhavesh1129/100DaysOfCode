package day4;

import java.util.Scanner;

public class Qns7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			
			System.out.print("*\n");
		}
	}
}
