package javaPractice;

import java.util.Scanner;
//8
public class ReverseStringwordWise {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String temp="";
		String[] strarray= str.split(" ");

		for(int i=0;i<strarray.length;i++) {
			String tem=strarray[i];
			for(int j=tem.length()-1;j>=0;j--) {
				
				temp=temp+tem.charAt(j);
			}
			temp=temp+" ";
		}
		System.out.println(temp.trim());
	
}
}
