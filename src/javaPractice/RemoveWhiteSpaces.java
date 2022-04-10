package javaPractice;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String arr[] = str.split(" ");
		str = "";
		for (int i = 0; i < arr.length; i++) {
			
			str = str + arr[i];
		}
		System.out.println(str);
	}

}
