package day4;

import java.util.Scanner;

public class Qns5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int space=n/2;
		int star=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
				}
			System.out.println();
			}
		}
	}
