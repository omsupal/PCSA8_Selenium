package javaPractice;

import java.util.Scanner;
//7
public class DuplicateWordsinString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String strar[] = str.split(" ");
		
		
		for (int i = 0; i < strar.length; i++) {
			int count=0;
			boolean flag=false;
			for (int j = i; j < strar.length; j++) {
				if(strar[i].equals(strar[j])) {
					flag=true;
					count++;
				}
			}
			if(flag==true) {
				System.out.println(strar[i]+" occurance "+count);
			}
		}
		

	}

}
