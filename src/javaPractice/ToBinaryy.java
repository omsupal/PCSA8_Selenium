package javaPractice;

import java.util.*;

public class ToBinaryy {
	 static void decimalToBinary(int num)
	    {
	        Stack<Integer> st = new Stack<>();
	        while (num > 0) {
	            st.push(num % 2);
	            num = num / 2;
	        }
	        while (!(st.isEmpty())) {
	
	            System.out.print(st.pop());
	        }
	    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < 4; i++) {
			arr[i] = scn.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			decimalToBinary(arr[i]);
			System.out.println();
		}

	}

}
