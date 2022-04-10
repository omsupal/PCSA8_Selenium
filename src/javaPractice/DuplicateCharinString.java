package javaPractice;

import java.util.Scanner;

public class DuplicateCharinString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char arr[] = new char[str.length()];
		System.out.println("Duplicates are");
		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;

			for (int l = 0; l < arr.length; l++) {
				if (arr[l] != str.charAt(i)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				arr[i] = str.charAt(i);
			}
			flag = false;

			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == arr[i]) {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.print(arr[i]+" ");
			}

		}

	}

}
