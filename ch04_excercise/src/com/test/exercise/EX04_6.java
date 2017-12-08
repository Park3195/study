package com.test.exercise;

import java.util.Scanner;

public class EX04_6 {

	public static void main(String[] args) {
//		for (int i = 1; i < 7; i++) {
//		if (i == 6) {
//			System.out.println("주사위가 6이 나올때 6이 되려면, 다른 주사위 하나를 박살내면 된다.");
//		} else
//			System.out.printf("주사위가 %d 가 나올때 6이 되려면 %d 가 나오면 된다.\n", i, 6 - i);
//	}
		Scanner scan = new Scanner(System.in);
		int sum = Integer.parseInt(scan.nextLine());
		sumResult(sum);
	}

	public static void sumResult(int sum) {
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == sum) {
					System.out.printf("(%d,%d)가 나오면 합이 %d이 된다.\n", i, j,sum);
				}
			}
		}
	}

}
