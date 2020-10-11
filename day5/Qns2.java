package day5;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int str=n;
		int sp=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=str;j++) {
				if(i>1 && i<=n/2 && j>1 && j<str) {
					System.out.print(" ");
				}else {
					System.out.print("*");}
			}
			if(i<=n/2) {
				str-=2;
				sp++;
			}else {
				str+=2;
				sp--;
			}
			System.out.println();
		}
	}
}
