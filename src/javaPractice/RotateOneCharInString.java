package javaPractice;

import java.util.Scanner;

public class RotateOneCharInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(str.substring(1)+str.substring(0,1));

	}

}
