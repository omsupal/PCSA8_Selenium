package javaPractice;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=scn.nextInt();
		}
		int a=0;
		for (int i = 0; i < 5; i++) {
			int c = arr[i] + a;
			System.out.println(c);
			a = c;

		}

	}

}
