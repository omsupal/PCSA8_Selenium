package javaPractice;

import java.util.Scanner;

public class RotationOfAnother {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String str2 = scn.next();
		String tem=str1;
		
		boolean flag=false;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				flag=false;
				str1=str1.substring(1)+str1.substring(0,1);
				if(str1.equals(str2)) {
					flag=true;
					break;
				}
				
			}
			if(flag==true) {
				System.out.println(tem+" is a rotation of "+str2);
			}else {
				System.out.println(str1);
			}
		}
	}

}
