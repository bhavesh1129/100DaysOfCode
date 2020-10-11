package day4;

import java.util.Scanner;

public class QNSS16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int str=1;
		int sp=2*n-3;
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=str;j++) {
				System.out.print(val++ +"\t");
			}
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			if(i==n) {
				str--;
				val--;
			}
			for(int j=1;j<=str;j++) {
				val--;
				System.out.print(val+"\t");
			}
			if(i>0) {
				str++;
				sp-=2;
			}else {
				str--;
				sp+=2;
			}
			System.out.println();
		}
	}
}
