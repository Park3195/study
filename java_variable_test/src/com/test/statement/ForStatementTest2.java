package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {
		// 1~10사이의 짝수를 더하시오.
		
	/*	
	  	int sum = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("더해진 정수는 : " + i);
				sum += i;
			}
		}

		System.out.println("10까지의 짝수의 합 = " + sum);
*/
		// 2단 구구단을 작성하시오.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		for(int i = 0; i<=10; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 10; i>=0; i--){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		int a = 0;
		for(int i = 0 ; i < 7; i ++){
			for(int j = 0; j <= i; j ++){
				a++;
				System.out.print(a +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
