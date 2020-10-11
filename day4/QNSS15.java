package day4;

import java.util.Scanner;

public class QNSS15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int str=1;
		int sp=n/2;
		int r_val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("\t");
			}
			int c_val=r_val;
			for(int j=1;j<=str;j++) {
				System.out.print(c_val +"\t");
				if(j<=str/2) {
					c_val++;
				}else {
					c_val--;
				}
			}
			if(i<=n/2) {
				sp--;
				str+=2;
				r_val++;
			}else {
				sp++;
				str-=2;
				r_val--;
			}
			System.out.println();
		}

	}

}
