//Print All Palindromic Substrings
package day11;

import java.util.Scanner;

public class Qns3 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String string=sc.next();
		palindromicString(string);
	}

	private static void palindromicString(String string) {
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<=string.length();j++){
				String str=string.substring(i,j);
				if(isPallidrome(str)==true) {
					System.out.println(str);
				}
			}
		}
	}
	private static boolean isPallidrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			char characterAtFirstIndex=str.charAt(i);
			char characterAtLastIndex=str.charAt(j);
			if(characterAtFirstIndex != characterAtLastIndex) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}
}
