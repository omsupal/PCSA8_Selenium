package javaPractice;

import java.util.Scanner;

public class CountOccuranceCharInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char arr[] = new char[str.length()];

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

			int count = 0;
			flag = false;

			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j) == arr[i]) {
					count++;
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("No of occurance of \"" + arr[i] + "\" is " + count);
			}

		}

	}

}
