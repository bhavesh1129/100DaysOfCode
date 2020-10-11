package day4;

import java.util.Scanner;

public class QNSS13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int v1=1;
			for(int j=0;j<=i;j++) {
				System.out.print(v1+" ");
				int v2=v1*(i-j)/(j+1);
				v1=v2;
			}
			System.out.println();
		}
	}
}
