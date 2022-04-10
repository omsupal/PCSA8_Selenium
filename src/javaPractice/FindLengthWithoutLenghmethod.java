package javaPractice;

import java.util.Scanner;
//5
public class FindLengthWithoutLenghmethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char strarray[]=str.toCharArray();
		int count=0;
		for (char c : strarray) {
			count++;
		}
		System.out.println(count);
	}

}
