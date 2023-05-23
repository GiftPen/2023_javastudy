package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_scanner4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.print("원하는 반복 횟수 : ");
		int su = scan.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = scan.next();
		
		
//		for (int i = 0; i < su; i++) {
//			System.out.println(str);
//		}
		
		int i = 0 ;
		while (i < su) {
			System.out.println(str);
			i++ ;
		}
		
//		원하는 회수를 입력 받고 
//		숫자를 입력 받아서   // 숫자 물어보고 다시 위로 올라와서 다시 숫자 물어보라는 문구가 나와야함
//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
//
//		이름, 국어, 영어, 수학를 입력 받아서 
//		총점, 평균, 학점을 구하고 
//		이름, 총점, 평균, 학점을 출력하는 코딩 
//		(평균은 소숫점 첫째자리까지 구하자)
//
//
//		첫번째 숫자 받기
//		두번째 숫자 받기
//		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		// 첫번쨔 숫자와 두번째 숫자가 넣은 연산자 숫자에 의해 계산되야함
		// 나누기는 소수점이 있어서 더블로 계산 되게끔 해야한다
	}

}
