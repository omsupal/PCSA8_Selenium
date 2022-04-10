package javaPractice;

import java.util.Scanner;
//3
public class StringFirstandSecondhalfSeparate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String first = str.substring(0, str.length() / 2);
		
		String second = str.substring((str.length() / 2));
		System.out.println(reverse(first) + " " + reverse(second));
		
		
	}
	public static String reverse(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}

}
