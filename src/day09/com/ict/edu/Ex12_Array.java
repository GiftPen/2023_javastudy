package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		
		// 키보드로 몇명인지 학생수 받고
		Scanner scan = new Scanner(System.in) ;
		System.out.print("학생 수를 입력 하세요 :");
		int stu = scan.nextInt();
		double[][] arr = new double[stu][8] ;
		for (int i = 0; i < arr.length; i++) {
			// for문이 실행 될 때 마다 한사람의 정보를 담을 수 있는 배열을 만들자 ******중요
			// 배열안에 객체
			double[] p = new double[8] ; // new 새로만들어져서 반복될때마다 p 는 다 주소가 다르며 , 선언을 여러번하게 된 결과
			
			
			// 키보드로 번호, 국어, 영어, 수학
			// 총점, 평균, 학점, 순위(초기값지정)
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			
			System.out.print("국어 : ");
			p[1] = scan.nextInt();

			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			p[4] = p[1] + p[2] + p[3] ;
			
			p[5] = (int)(p[4]/3.0*10)/10.0 ;
			
			if (p[5] >= 90) {
				p[6] = 'A' ;
			} else if (p[5] >= 80) {
				p[6] = 'B' ;
			} else if (p[5] >= 70) {
				p[6] = 'C' ;
			} else {
				p[6] = 'F' ;
			} 
			p[7] = 1 ;
			
			// ** 다차원 배열에 넣자
			arr[i] = p ;
		}
//		int num = 0 ;
//		int kor = 1 ;
//		int eng = 2 ;
//		int math = 3 ;
//		// 키보드로 번호, 국어, 영어, 수학
//		for (int i = 0; i < stu; i++) {
//			for (int j = 0; j < 4; j++) {
//				if(j == num) {
//					System.out.print("번호를 입력해주세요 : ");
//					arr[i][num] = scan.nextInt();
//				}else if (j == kor) {
//					System.out.print("위학생의 국어 점수 : ");
//					arr[i][kor] = scan.nextInt();
//				}else if (j == eng) {
//					System.out.print("위학생의 영어 점수 : ");
//					arr[i][eng] = scan.nextInt();
//				}else if (j == math) {
//					System.out.print("위학생의 수학 점수 : ");
//					arr[i][math] = scan.nextInt();
//				}
//			}
//		}
		
//		int sum = 4 ;
//		int avg = 5 ;
//		int hak = 6;
//		int rank = 7 ;
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
//		
		// 순위 구하고
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// if(i == j) continue ;  (생략가능) 같을떄 뭘 하지 않아서 생략가능
				if(arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		
		// 순위로 오름차순 정렬하고
		// 자리를 바꾸기위해 임시를 만든다
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j] ;
					arr[j] = tmp ;
				}
			}
		}
		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국영수는 출력에서 제외 시키기
				if(j == 1 || j == 2 || j == 3)continue ;
				if(j == 5) {
					System.out.print(arr[i][j] + "\t");
				}else if(j == 6){
					System.out.print((char)arr[i][j] + "\t");
				}else {
					System.out.print((int)arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
