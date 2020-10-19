//Toggle Case
package day12;

import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		toggleCase(str);
	}

	private static void toggleCase(String str) {
		StringBuilder string=new StringBuilder(str);
		for (int i = 0; i < string.length(); i++) {
			char alpha=string.charAt(i);
			if(alpha>='a' && alpha<='z') {
				char upperCase=(char) (alpha-'a'+'A');
				string.setCharAt(1, upperCase);
			}else if(alpha>='A' && alpha<='Z') {
				char lowerCase=(char) (alpha+'a'-'A');
				string.setCharAt(1, lowerCase);
			}
		}
		System.out.println(string.toString());
	}
}
