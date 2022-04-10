package javaPractice;

import java.util.Scanner;

public class FindHowMuchLowercaseUpperandspecialChar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int lwr=0;
		int uppr=0;
		int spc=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				uppr++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				lwr++;
			}else {
				spc++;
			}
		}
		System.out.println("uppercase = "+uppr+"\nlowecase = "+lwr+"\nspecial characters = "+spc);

	}

}
