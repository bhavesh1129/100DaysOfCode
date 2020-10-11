//Ceil And Floor Values
package day7;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class Qns4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfElements=sc.nextInt();
		int[] arr= new int[numberOfElements];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		ceilAndFloorValues(arr,element);
	}

	private static void ceilAndFloorValues(int[] arr, int element) {
			Arrays.sort(arr);
			int lowestNumber=0;
			int highestNumber=arr.length-1;
			int midNumber;
			int ceilValue=0;
			int floorValue=0;
			while(lowestNumber<=highestNumber) {
				midNumber=(lowestNumber+highestNumber)/2;
				if(element>arr[midNumber]) {
					lowestNumber=midNumber+1;
					ceilValue=arr[midNumber];
				}else if(element<arr[midNumber]) {
					highestNumber=midNumber-1;
					floorValue=arr[midNumber];
				}else {
					ceilValue=arr[midNumber];
					floorValue=arr[midNumber];
				}
			}
			System.out.print(floorValue+"\n"+ceilValue);
	}
}
