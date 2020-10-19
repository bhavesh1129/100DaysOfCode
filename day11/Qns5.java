//String Compression
package day11;

import java.util.Scanner;

public class Qns5 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(stringCompression1(str));
		System.out.println(stringCompression2(str));
	}

	private static String stringCompression2(String str) {
		String main=str.charAt(0)+"";
		int count=1;
		for (int i = 1; i < str.length(); i++) {
			char latest=str.charAt(i);
			char old=str.charAt(i-1);
			if(latest==old) {
				count++;
			}else {
				if(count>1) {
					main+=count;
					count=1;
				}
				main+=latest;
			}
		}
		if(count>1) {
			main+=count;
			count=1;
		}
		return main;
	}

	private static String stringCompression1(String str) {
		String main=str.charAt(0)+"";
		for (int i = 1; i < str.length(); i++) {
			char latest=str.charAt(i);
			char old=str.charAt(i-1);
			if(latest!=old) {
				main+=latest;
			}
		}
		return main;
	}
}
