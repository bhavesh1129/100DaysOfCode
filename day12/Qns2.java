package day12;

import java.util.Scanner;

public class Qns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		stringWithDifferenceOfTwoConsecutiveCharacters(str);
	}

	private static void stringWithDifferenceOfTwoConsecutiveCharacters(String str) {
		StringBuilder string=new StringBuilder(str);
		int diff = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch1=string.charAt(i);
			for (int j = 1; j < str.length(); j++) {//pep
				char ch2=string.charAt(i+1);
				diff=ch2-ch1;
			}
		}
		System.out.println(diff);
	}

}
