package com.string.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringTest {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String msg = "반갑습니다.";
		System.out.println(msg);
		
		System.out.println("문자열 길이 : "+msg.length());
		System.out.println("문자열 비교 : " + msg.equals("안녕하세요."));
		
		System.out.println("문자탐색 : "+ msg.contains("반갑"));
		//문자열에 탐색하고자하는 문자가 있는가?
		System.out.println("비교 인덱스 반환 : " + msg.indexOf("갑"));
		//'니다.' 를 msg 에서 찾아서 '반'(시작=0)부터 "."(끝=5)까지중에 반환해야하는 값을 알려준다.
		System.out.println("index의 글자 반환 : " + msg.charAt(2));
		// 문자열에 인덱스가 2인 한 글자를 가져와라.
		System.out.println("빈문자열 확인 : "+ msg.isEmpty());
		// 빈문자열인지 확인하기
		System.out.println("문자열 교체 : " + msg.replace("반갑습", "감사함"));
		// 문자열이 앞에 문장에서 뒤의 문장으로 교체된다.
		System.out.println("문자열 잘라내기 : " + msg.substring(0,3));
		// 인덱스가 0 부터 3 이전까지(2까지) 문자를 자른다.
		System.out.println("대문자 변환 : "+ msg.toUpperCase());
		System.out.println("소문자 변환 : "+ msg.toLowerCase());
		
		boolean isNumber = true;
		for(int index = 0; index < msg.length(); index++){
			System.out.println(msg.charAt(index));
			char ch = msg.charAt(index);
			if(!(ch >=48 && ch<=57)){
				isNumber = false;
			}
		}
		
		System.out.println(isNumber?"숫자":"숫자가 아님");
		
		
		
		
		
	}

}
