package javaPractice;

import java.util.Scanner;
//1
public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);

	}

}
