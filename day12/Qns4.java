//Remove Primes in ArrayList
package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < sizeOfArray; i++) {
			list.add(sc.nextInt());
		}
		
		removePrimesFromArrayList(list);
		System.out.print(list);
	}

	private static void removePrimesFromArrayList(ArrayList<Integer> list) {

		for (int i=list.size()-1;i>=0;i--) {
			int val=list.get(i);
			
			if(isPrime(val)==true) {
				list.remove(i);
			}
		}
	}

	private static boolean isPrime(int val) {
		for (int divisor = 2; divisor*divisor <= val; divisor++) {
			if(val%divisor==0) {
				return false;
			}
		}
		return true;
	}
}
