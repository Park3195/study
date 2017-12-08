package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {
	public static void main(String[] ar) {
		// 임의의 숫자 7개를 입력받아 가장 큰수와 가장 작은 수를 출력하는 프로그램을 작성하시오.
		// 실행결과)
		// 1번째 숫자 : 33
		// 2번째 숫자 : 53
		// ...
		// 7번째 숫자 : 34
		//
		// max = 333
		// min = 33

		Scanner scan = new Scanner(System.in);
		int[] a = new int[7];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번째 숫자 : ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		Arrays.sort(a);

		System.out.println("max = " + a[a.length - 1]);
		System.out.println("min = " + a[0]);
	}
}
