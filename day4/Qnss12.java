package day4;

import java.util.Scanner;

public class Qnss12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int temp=0;
		for(int k=1;k<=n;k++) {
			for(int j=1;j<=k;j++) {
				System.out.print(temp+" ");
				temp=b;
				b=a+b;
				a=temp;
			}
			System.out.println();
		}
	}
}
