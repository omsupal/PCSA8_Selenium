package javaPractice;

import java.util.Scanner;
//6
public class FindhowmanyString {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String strarr[]=str.split(" ");
		System.out.println(strarr.length+" words are present in given string");
		
	}

}
