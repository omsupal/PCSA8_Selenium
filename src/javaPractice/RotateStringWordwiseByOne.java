package javaPractice;

import java.util.Scanner;

public class RotateStringWordwiseByOne {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		rotate(str);
		

	}
	public static void rotate(String str) {
		String array[]=str.split(" ");
		String temp="";
		for(int i=0;i<array.length;i++) {
			temp=temp+array[i].substring(1)+array[i].substring(0,1)+" ";
		}
		System.out.println(temp.trim());
	}

}
