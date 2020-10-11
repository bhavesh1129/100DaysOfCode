package day4;

import java.util.Scanner;

public class Qnss14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int mul=1;
		for(int i=1;i<=10;i++) {
			mul=x*i;
			System.out.println(x+" * "+i+" = "+mul);
		}
	}
}
