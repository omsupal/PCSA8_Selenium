package javaPractice;

import java.util.Scanner;
//2
public class ReversSringRecursive {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(reverse(str));
	}
	public static String reverse(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}
}
