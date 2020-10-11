package day4;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
}
