package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		System.out.println("출력할 세트 수를 입력하시오.");
		int setNum = Integer.parseInt(new Scanner(System.in).nextLine());
		
		for(int k= 0; k< setNum; k++){
		
		int index =0;
		int[] lottoNum =new int[45];
		for(int i = 0; i<lottoNum.length; i++){
			lottoNum[i] = i+1;
		}
		

		
		int tempNum =0;
		int changeIndex =0;
		
		for(int i = 0; i<lottoNum.length*2; i++){
			changeIndex = (int)(Math.random()*lottoNum.length);
			tempNum = lottoNum[changeIndex];
			lottoNum[changeIndex] = lottoNum[0];
			lottoNum[0] =tempNum;
		}
		
//		int num = 0;
//		for(int i=0; i<6; i++){
//			for(int j = 0; j<6; j++){
//				if(lottoNum[i] < lottoNum[j]){
//					num = lottoNum[j];
//					lottoNum[j] = lottoNum[i];
//					lottoNum[i] = num;
//				}
//			}
//		}
		
//		for(int i=0; i<6; i++){
//			System.out.print(lottoNum[i]);
//			System.out.print(i==5?"\n":", ");
//		}
		
		int[] output = new int[6];
		output = Arrays.copyOfRange(lottoNum, 0, 6);//
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
			
//		for(int i = 0; i<lottoNum.length; i++){
//			for(int j = 0; j<lottoNum.length; j++){
//				int ran =(int)(Math.random()*lottoNum.length);
//				index = lottoNum[ran];
//				lottoNum[ran] = lottoNum[j];
//				lottoNum[j] = index;
//			}
//		}
//		
//		for(int i = 0; i<6; i++){
//			
//			System.out.print(lottoNum[i]);
//			if(i<5){
//				System.out.print(", ");
//			}
//		}
		}
	}

}
