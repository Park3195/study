package com.test.math;

public class MathRandomTest {

	public static void main(String[] args) {
		// 0 <= math.random() < 1 인 임의의 실수
		System.out.println(Math.random());
		
		//1~10 사이의 임의 정수
		int randomInt = (int)(Math.random()*10+1);
		System.out.println(randomInt);

	}

}
