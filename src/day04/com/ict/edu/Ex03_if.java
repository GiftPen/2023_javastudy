package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 때만 실행, 거짓이면 if 문 무시
		// 형식) if(조건식){
		//               조건식이 참일때 실행할 문장 ;
		//               조건식이 참일때 실행할 문장 ;
		//               조건식이 참일때 실행할 문장 ;
		//        }
		//       단, 실행문장이 한줄이면 {} 불록을 생략할 수 있다.
		
		//   형식)   if(조건식)  조건식이 참일때 실행할 문장;   // 이렇게 한줄로 쓸수 있고
		//   형식)   if(조건식)
		//                   조건삭아 참일때 실행할 문장;  // 한줄일때 헷갈리면  {} 써도됨
		
		// int k1 이 60 이상이면 합격
		int k1 = 50 ;
		String res = "초기값" ;
		if (k1 >= 60 ) {
			res = "합격" ;
			
		}
		
		if (k1 < 60)     // 초기값에 불합격을 쓰면 이렇게 두번 할 필요가 없다
			res = "불합격";
		
		System.out.println("결과 : " + res);
		
//		int k2 가 홀수 인지 짝구 인지 판별하자.
		int k2 = 43 ;
		res = "짝수" ;
		if (k2 % 2 == 1)      // 
			res = "홀수" ;
		System.out.println("결과 : " + res);
		
		// char k3 가 대문자안지, 아닌지 판별하자
		char k3 = 'a' ;
		res = "대문자 아님" ;
		if (k3 >= 'A' && k3 <= 'Z') {
			res = "대문자" ;
		}
		System.out.println("결과 : " + res);
		
		 //근무시간이 8시간까지는 시간당 9620 이고
	    // 8시간을 초과한 시간 만큼은 1.5배를 지급한다.
	    // 현재 근무한 시간이 10이다.
	    // 얼마를 받아야 하는가?
		
		int time = 10 ; // 내가 일한시간
		int limt = 8 ; //  리미트
		int dan = 9620 ;
		int pay = time * dan ;
		if (time > limt) {
			pay = (limt * dan) +(int)((time - limt) * dan*1.5) ;
		}
		System.out.println("결과 : " + pay);
		
		
	}

}
