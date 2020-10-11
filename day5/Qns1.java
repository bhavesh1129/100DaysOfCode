package day5;

import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int str=1;
		int sp=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				if(i==n/2+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=str;j++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				str++;
			}else {
				str--;
			}
			System.out.println();
		}

	}

}
