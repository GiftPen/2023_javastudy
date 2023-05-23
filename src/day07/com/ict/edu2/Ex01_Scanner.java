package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째짜리까지 구하자)
		int i = 0 ;
		int z = 0 ;
		while(i >= 0) {
			System.out.print("숫자입력 : ");
			int su1 = scan.nextInt();
			String str = "" ;
			if (su1 % 2 == 0) {
				str = "짝수" ; z = z + 1 ; // z++;
			} else {
				str = "홀수" ;
			}
			System.out.println(su1 + "는 " + str + "입니다.");
			
			System.out.print("계속할까요?(1.yes, 2.no) >>");
			int s2 = scan.nextInt();
			i  ++ ;
			if(s2 == 2) break ;
			
		}
		 double pug =  (int)((z*1.0/i)*100*10)/10.0;
		    System.out.println("전체횟수 : " + i);
		    System.out.println("짝수횟수 : " + z);
		    System.out.println("짝수 퍼센트 : " + pug  + "% 입니다.");
		
		
		
		
		//
		while(true) {
		System.out.print("숫자입력 : ");
		int su = scan.nextInt();
		String str1 = "" ;
		if (su % 2 == 0) {
			str1 = "짝수" ;
		} else {
			str1 = "홀수" ;
		}
		System.out.println(su + "는 " + str1 + "입니다.");
		
		System.out.print("계속할까요?(1.yes, 2.no) >>");
		int s1 = scan.nextInt();
		if(s1 == 2) break ;
	 }
		// 과제  1번과 2번이 아닌 숫자를 입력했을때 '다시 입력하세요 ' 뜨고 반복하는것을 만들어 오기
	}
}
