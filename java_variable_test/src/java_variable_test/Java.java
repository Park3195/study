package java_variable_test;

import java.util.Scanner;

public class Java {
	public static void main(String[] ar) {
		int sum = 0;
		int sumPlus = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
			sumPlus += sum;
		}
		System.out.println(sum);
		System.out.println(sumPlus);
		
		Scanner scan = new Scanner(System.in);
	}
}
