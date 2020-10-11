//Pythagorean Triplet
package day3;

import java.util.Scanner;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int A=a*a;
		int B=b*b;
		int C=c*c;
		if(A==B+C || B==A+C|| C==A+B) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
