package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//근무시간이 8시간까지는 시간당 9620 이고
	    // 8시간을 초과한 시간 만큼은 1.5배를 지급한다.
	    // 현재 근무한 시간이 10이다.
	    // 얼마를 받아야 하는가?
		System.out.print("근무시간 : ");
		int su = scan.nextInt();
		int pay = 9620 ;
		int dan = 0 ;
		if (su <= 8) {
			dan = su * pay ;
		} else {
			dan = 8 * pay + (int)((su - 8)*pay*1.5) ;
		}
		System.out.println("제가 받는 금액은: " + dan + "입니다.");

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = scan.nextInt() ;
         int zan = 2 ;
         int zibul = 10000 ;
         int zandon = 0 ;
         String str = "" ;
         
         if (menu == 1) {
			str = "카페모카" ;zandon = zibul-(int)((3500*zan)*(1.1)) ;
		} else if (menu == 2) {
			str = "카페라떼" ;zandon = zibul-(int)((4000*zan)*(1.1)) ;
		} else if (menu == 3) {
			str = "아메리카노" ;zandon = zibul-(int)((3000*zan)*(1.1)) ;
		} else if (menu == 4) {
			str = "과일쥬스" ;zandon = zibul-(int)((3500*zan)*(1.1)) ;
		}
		System.out.println("주문하신 메뉴 : " + str + " " + zan + "잔" );
		System.out.println("지불하신 금액 : " + zibul + " " + "잔돈 : " + zandon );
		
		// 나를 입력하면 수도가 출력되게 하자
		// 한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴, 이외에는 데이터 없음
		//(switch case)
		System.out.print("나라 : ");
		String str1 = scan.next() ;
		String res = "" ;
		switch (str1){
		 case "한국" : res = "서울" ;  break ;
		 case "중국" : res = "베이징" ;break ;
		 case "일본" : res = "도쿄" ;break ;
		 case "미국" : res = "워싱턴" ;break ;
		 default : res = "데이터 없음" ;
		}
		System.out.println("위나라의 수도는 : " + res);
		
		
	}

}
