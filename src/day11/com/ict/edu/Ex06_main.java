package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력 하자
		Ex06_method t1 = new Ex06_method();
//		// 입력받기
		Scanner scan = new Scanner(System.in);
//		System.out.print("학생수 : ");
//		int su = scan.nextInt();
//		int kor = 0 ;
//		int eng = 0 ;
//		int math = 0 ;
//		String name = "";
//		for (int i = 0; i < su ; i++) {
//			System.out.print("이름 : ");
//			name = scan.next();
//			System.out.print("국어 : ");
//			kor = scan.nextInt();
//			System.out.print("영어 : ");
//			eng = scan.nextInt();
//			System.out.print("수학 : ");
//			math = scan.nextInt();
//			// 총점 구하기
//			int p1 = t1.sum(kor,eng,math);
//			System.out.println("총점 : " + p1 );
//			// 평균 구하기
//			double p2 = t1.avg(p1);
//			System.out.println("평균 : " + p2 );
//			// 학점 구하기
//			double hak = t1.hak(p2) ;
//			System.out.println("학점 : " + (char)hak );
//		}
//		
		// 이름대신 번호 하는거 숙제 2차원
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력 하자
		// 입력받기
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		
		Ex06_method ex06 = new Ex06_method();
		for (int i = 0; i < hak.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			//총점
			sum[i] = ex06.getSum(kor[i], eng[i], math[i]) ;
			//평균
			avg[i] = ex06.getAvg(sum[i]);
			//학점
			hak[i] = ex06.hak(avg[i]);
		}
		

		// 출력하기
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(hak[i]);
		}
		
	}
}
