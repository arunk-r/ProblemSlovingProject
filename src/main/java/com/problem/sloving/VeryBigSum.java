package com.problem.sloving;

import java.util.Scanner;

public class VeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		long x = 0;
		for (int i : arr) {
			x = x + i;
		}
		System.out.print(x);
	}
}
