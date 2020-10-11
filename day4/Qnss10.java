package day4;

import java.util.Scanner;

public class Qnss10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int os=n/2;
		int is=-1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=os;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<=is;j++) {
				System.out.print(" ");
			}
				if(i>1&&i<n) {
					System.out.print("*");
				}	
				if(i<=n/2) {
					os--;
					is+=2;
				}else {
					os++;
					is-=2;
				}
		System.out.println();
		}
	}
}
