package com.test.array;

import java.util.Scanner;

public class Aa {
	public static void main(String[] ar){
		//학생 10명의 이름, 국/영/수 점수를 입력받아 
		//각각의 학생의 평균을 출력하는 프로그램을 작성하시오.
		
		String[][] studentArray = new String[3][4];
		Scanner scan = new Scanner(System.in);
		//입력
		for(int num =0; num <studentArray.length; num++){
			System.out.println((num+1)+"번 학생");
			System.out.print("이름 : ");
			studentArray[num][0] = scan.nextLine();
			System.out.print("국어 : ");
			studentArray[num][1] = scan.nextLine();
			System.out.print("영어 : ");
			studentArray[num][2] = scan.nextLine();
			System.out.print("수학 : ");
			studentArray[num][3] = scan.nextLine();
			
		}
		//출력
		int total = 0;
		for(int num =0; num <studentArray.length; num++){
			total = Integer.parseInt(studentArray[num][1])
					+Integer.parseInt(studentArray[num][2])
					+Integer.parseInt(studentArray[num][3]);
			System.out.println((num+1)+"번 "+studentArray[num][0]+
					" 평균 : "+ (total*1f/(studentArray[num].length-1))
					);
		}
		
		
		
		
		
		
		
		
	}
}
