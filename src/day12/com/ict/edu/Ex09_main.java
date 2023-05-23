package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("학생수 : ");
		int su =scan.nextInt() ;
		Ex09_Constructor [] arr = new Ex09_Constructor[su];
		
		for (int i = 0; i < su; i++) {
			
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("국어 : ");
			int kor = scan.nextInt() ;
			System.out.print("영어 : ");
			int eng = scan.nextInt() ;
			System.out.print("수학 : ");
			int math = scan.nextInt() ;
			Ex09_Constructor p1 = new Ex09_Constructor(name,kor, eng, math);
			// 안에 하는 이유는 돌때마다 값이 변경 되야 하므로
			
			p1.setRank(1);

			arr[i] = p1;
		
		}
		System.out.print("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < su; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.print(arr[i].getRank() + "\t");
			System.out.println();
		}
	}
}
