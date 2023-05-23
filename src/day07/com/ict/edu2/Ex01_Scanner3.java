package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요(1.yes, 2.no) 일 때 Ex01_Scanner2는 숫자로 받았는데
		// 문자가 들어오면 오류가 발생 한다.
		// 그래서 문자로 받아서 처리 하도록 하자.

		Scanner scan = new Scanner(System.in);

		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째짜리까지 구하자)
		int i = 0;
		int z = 0;
		esc: while (i >= 0) {
			i++;
			System.out.print("숫자입력 : ");
			int su1 = scan.nextInt();
			String str = "";
			if (su1 % 2 == 0) {
				str = "짝수";
				z = z + 1; // z++;
			} else {
				str = "홀수";
			}
			System.out.println(su1 + "는 " + str + "입니다.");
			while (true) {
				System.out.print("계속할까요?(Y(y)/N(n)) >>");
				String s1 = scan.next();
				if (s1.equalsIgnoreCase("y")) {
					continue esc;
				} else if (s1.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력하세요");
					continue;
				}

			}
		}
		double pug = (int) ((z * 1.0 / i) * 100 * 10) / 10.0;
		System.out.println("전체횟수 : " + i);
		System.out.println("짝수횟수 : " + z);
		System.out.println("짝수 퍼센트 : " + pug + "% 입니다.");

	}

}
