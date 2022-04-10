package javaPractice;

import java.util.Scanner;

public class CheckAnagramofGivenTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.nextLine();
		String str2 = scn.nextLine();
		str1=str1.toLowerCase().replaceAll("\\s", "");
		str2=str2.toLowerCase().replaceAll("\\s", "");
		System.out.println(str1+" "+str2);
		if(str1.length()==str2.length()) {
			anagram(str1,str2,str2.length());
		}else {
			System.out.println("Not a anagram");
		}
		
	}
	public static void anagram(String str, String str1, int n) {
		boolean flag=false;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<n;j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
		if(flag==true) {
			System.out.println(str1 +" and "+str+" are anagram");
		}else {
			System.out.println("Not  anagram");
		}
	}

}
