package javaPractice;

import java.util.Scanner;

public class CountOccurancegivenCharInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String c = scn.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (c.charAt(0) == str.charAt(i)) {
				count++;
			}
		}

		System.out.println("No of occurance of \"" + c + "\" is " + count);

	}

}
