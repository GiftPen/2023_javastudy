package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카가 6500이다.
		// 친구와 둘이서 15000을 내고 주문했다.
		// 잔돈은 얼마 인가?(단, 부가세 10%포함)
		
		// 13000 에 부가세 1300원 카페모카(물건) 곱하기 수량 + 부가세 앞의 가격의 10프로 를 
		//  준 돈에서 빼면 잔돈
		
		int cafe = 6500 ;  // 음식의 가격
		int order = 2 ;    // 구매한 수량
		int cal = 15000 ; // 손님이 계산하려고 낸 금액
		int pay = cafe * order ;  // 구매한 총가격
		int vat = pay / 10 ;    //  구매한 가격의 부가세
		int cha = cal - (pay + vat) ;   // 우리가 구하고자한 잔돈
		
		System.out.println(cha + "원");
		
		
		
		// 입력정보
		String coff = "카페모카" ;
		int dan = 6500 ; 
		int su = 2 ;
		int in = 15000 ;
		
		// 부가세를 구하기 위해서 총금액을 구하자 
		int total = dan * su ;
		int vat1 = total / 10 ;   
		int vat2 = (int) (total * 0.1) ; // 부가세를 구하는 또다른 방법
		int out = in - (total + vat1) ;
		
		System.out.println("잔돈 : " + out);
		//위 정보를 한번에 처리 
		int out2 = in - (int)(total * 1.1) ; // 한번에
		
		System.out.println("잔돈 : " + out2);
		
		
		
		
		
	}

}
