package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문 
		// 형식) if(조건식1){
		//			조건식1이 참일때 실핼할 문장;
		//			조건식1이 참일때 실핼할 문장;
		//        }else if(조건식2){
		//			조건식1는 거짓이면서 조건식2가 참일때 실행할 문장;
		//			조건식1이 거짓이면서 조건식2가 참일때 실핼할 문장;
		//        }else if(조건식3){
		//			조건식1,2는 거짓이면서 조건식3가 참일때 실행할 문장; //
		//			조건식1,2이 거짓이면서 조건식3가 참일때 실핼할 문장;
		//        }else{
		//				조건식 1,2,3 모두 거짓인 경우
		//		  }
		
		// int k1의 점수가 90이상미녀 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F 학점
		int k1 = 0 ;
		String str = "" ;
		if (k1 >= 90) {
			str = "A학점" ;
		} else if (k1 >= 80) {
			str = "B학점" ;
		} else if (k1 >= 70) {
			str = "C학점" ;
		} else {
			str = "F학점" ;
		}
			System.out.println("결과 : " + str);
		
		// char k2 가 대문자인지 ,  소문자인지,  숫자인지,  기타문자인지 판별하자
		char k2 = '[' ;
		if (k2 >= 'A' && k2 <= 'Z') {
			str = "대문자" ;
		} else if (k2 >= 'a' && k2 <= 'z') {
			str = "소문자" ;
		} else if (k2 >= '0' && k2 <= '9') {
			str = "숫자" ;
		} else {
			str = "기타 문자" ;
		}
			System.out.println("결과 : " + str);
		
		// char k3이 A, a 이면 아프리카, B,b 이면 브라질 , C,c 이면 캐나다 , 나머지는 한국
		char k3 = 'f' ;
		if (k3 == 'a' || k3 == 'A') {
			str = "아프리카" ;
		} else if (k3 == 'b' || k3 == 'B') {
			str = "브라질" ;
		} else if (k3 == 'c' || k3 == 'C') {
			str = "캐나다" ;
		} else {
			str = "한국" ;
		}
		System.out.println("결과 : " + str);
		
		
		// menu가 1이면 카페모카 3500, 2이면 4000, 3이면 아메리카노 3000,
		// 4이면 과일 주스 3500이다.  친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가?(부가세 10% 포함), 친구와 같은 음료만 선택 가능
		int menu = 1 ; // 메뉴 번호
		int pay = 10000 ; // 내는 금액
		int su = 2 ; //  먹는 잔수
		int dan = 0 ;
		String drink = " " ;
		
		if (menu == 1) {
			drink = "카페모카" ;
			dan = 3500 ;
		} else if (menu == 2) {
			drink = "카페모카" ;
			dan = 3500 ;
		} else if (menu == 3) {
			drink = "카페모카" ;
			dan = 3500 ;
		} else if (menu == 4) {
			drink = "카페모카" ;
			dan = 3500 ;
		} 
		
		int total = dan * su ;
		int vat = (int)(total * 0.1);
		int out = pay - (total + vat) ;
		
		System.out.println("선택메뉴 : " + drink);
		System.out.println("잔돈 : " + out);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if (menu == 1) {
//			zan = pay - (int)(3500*su*1.1) ;
//		} else if (menu == 2) {
//			zan = pay - (int)(4000*su*1.1) ;
//		} else if (menu == 3) {
//			zan = pay - (int)(3000*su*1.1) ;
//		} else if(menu == 4){
//			zan = pay - (int)(3500*su*1.1) ;
//		} else {
//			zan = pay ;
//		}
//		System.out.println("잔돈 : " + zan);
		
	}

}
