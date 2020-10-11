//Rotate A Number
package day2;

import java.util.Scanner;

public class Qns6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();//Rotating times 
		int count=(int)Math.floor(Math.log10(n)+1);
		int div=1;
		int mul=1;
		
		k=k%count;//If k>n
		if(k<0) {//If k<0
			k=k+count;
		}
		
		for(int i=1;i<=count;i++) {//If k>0
			if(i<=k) {
				div=div*10;
			}else {
				mul=mul*10;
			}
		}
		int quo=n/div;
		int rem=n%div;
		int rot=mul*rem+quo;
		System.out.println(rot);
		
//................................................................................		
		
//		int c=n;
//		if(k>0) {
//		while(k-- >0) {
//			int a=c%10;
//			c=c/10;
//			c = Integer.parseInt(a+""+c);	
//		}
//		System.out.println(c);
//	}else {
//		while(k++ <0) {
//			int a=c%10;
//			c=c/10;
//			c = Integer.parseInt(a+""+c);	
//		}
//	}

	}
}
