package javaPractice;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println(rev +" is a palindrome");
		}
	}

}
