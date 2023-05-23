package day09.com.ict.edu;

import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {
		// 가변길이 new int[2][] ; 
		
		// 가장 큰값 과 가장 작은 값을 구하기
		int[] su = {90,87,-20,120,67,23,40,53};
		
		// 오름차순
		Arrays.sort(su);
		
		System.out.println("가장 작은 값 : " + su[0]);
		System.out.println("가장 큰값 : " + su[su.length -1]);  // 인덱스 값과 렝스 값은 1차이 난다 그래서 -1 무조건
		
	}
}
