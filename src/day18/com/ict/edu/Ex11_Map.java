package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex11_Map {
	// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
	// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
	// 출력되는 프로그램 작성

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("대한민국", "서울");
		map1.put("캐나다", "오타와");
		map1.put("영국", "런던");
		map1.put("스위스", "베른");
		Scanner sc = new Scanner(System.in);
		String k = "";
		String dasi = "";

		Iterator<String> it = map1.keySet().iterator();
	 while (true) {
			System.out.print("나라를 입력하세요 >>");
			k = sc.next();
			if (map1.containsKey(k)) {
				System.out.println(k + "의 수도는 " + map1.get(k) + "입니다");
			} else {
				System.out.println("데이터가 없는 나라입니다.");
			}

			System.out.println("다시 하시겠습니까?(y/n) >> ");
			dasi = sc.next();
			if (dasi.equalsIgnoreCase("y")) {
			}
			if (dasi.equalsIgnoreCase("n")) {
				break ;
			}
		}
	}
}
