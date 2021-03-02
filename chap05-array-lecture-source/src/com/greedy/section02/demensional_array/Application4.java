package com.greedy.section02.demensional_array;

public class Application4 {
	public static void main(String[] args) {
		
		/* 2차원 배열도 할당과 동시에 JVM 기본값 외의 값으로 초기화 하고 싶은 경우 
		 * 리터럴을 이용할 수 있다 */
		
		/* 선언과 할당을 하여 초기화 */
		/* 1. 정변배열 */
		int[][] iarr = {{1,2,3,4,5 }, {6,7,8,9,10 }, {11,12,13,14,15 }};
		
		
		// 반복문을 통해 출력
		for(int i = 0; i < iarr.length; i++) {
			
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
		
		/* 가변배열 */
		int[][] iarr2 = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};
		
		// 반복문을 이용해 출력
		for(int i = 0; i < iarr2.length; i++) {
			
			for(int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
		
		/* 미리 할당한 배열을 이용한 방식 */
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		
		int[][] iarr3 = {arr1, arr2}; //이게 히트임. @@@@@@@@ 
		
		/* 반목문을 이용한 값 출력 */
		for(int i = 0; i < iarr3.length; i++) {
			
			for(int j = 0; j < iarr3[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
