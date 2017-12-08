package com.test.array;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		int[] intArray2 = { 1, 2, 3, 4, 5 };
		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };
		intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 위에 있지만 재정의를
																// 통해서 만들 수 있다.

		int[] intArray4 = new int[100];
		for (int index = 0; index < intArray4.length; index++) {
			intArray4[index] = index + 1;
			System.out.print(intArray4[index] + (intArray4[index] % 10 != 0 ? ", " : "\n"));
			// if(index%10 == 9){
			// System.out.println();
			// } else{
			// System.out.print(", ");
			// }
		}

		// 2차원 배열 ( 행 x 열) -> 배열 안에 배열

		int[][] intArrays = new int[3][3];
		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] scoreTable = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };

		for (int i = 0; i < scoreTable.length; i++) {
			int sum = 0;
			for (int j = 0; j < scoreTable[i].length; j++) {
				sum += scoreTable[i][j];
			}
			System.out.println("scoreTable[" + i + "][1~3] : " + (sum / 3));
			System.out.println((i + 1) + "번 학생의 평균 : " + (sum / 3f));
		}
		System.out.println();
		
		
		String[] a = { "국어", "영어", "수학" };
		int[] sum = new int[3];
		for (int i = 0; i < scoreTable[i].length; i++) {
			for (int j = 0; j < scoreTable.length; j++) {
				sum[i] += scoreTable[j][i];
			}
			System.out.println(a[i] + "평균 : " + (sum[i] / scoreTable.length));
		}

	}
}
