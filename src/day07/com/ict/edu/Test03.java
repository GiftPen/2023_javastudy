package day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		원하는 회수를 입력 받고 
//		숫자를 입력 받아서   // 숫자 물어보고 다시 위로 올라와서 다시 숫자 물어보라는 문구가 나와야함
//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		System.out.print("원하는 횟수 : ");
		int su = scan.nextInt();
		String res = "";
		for (int i = 0; i < su ; i++) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			if(num % 2 == 0) {
				res = "짝수";
			}else {
				res = "홀수";
			}
			System.out.println("당신이 입력한 " + num + "은 " + res + "입니다.");
		}
		
		
}
}
