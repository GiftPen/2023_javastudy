package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 => 조건이 참 일때와 거짓 일때를 구분해서 실행한다.
		// 형식) 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 : 조건식이 거짓일때 실행할 문장 ;
		// 주의사항**) 변수, 참일때 실행 결과, 거짓일때 실행 결과 모두 같은 자료형이어야 한다.
		// 조건식에는 boolean(true, false), 비교연산자(>, < , <= ,= , ..등등) ,논리연산자
	
		// boolean
		String str = (false) ? "강아지" :  "고양이" ;  // string 강아지 고양이 모두 같은 자료형
		System.out.println("결과 : " + str);
		
		// 비교연산자
//		str = (조건식) ? 참일때 : 거짓일때 ;
		// int avg = 80 ;
		double avg = 55.3 ;  // 크기만 비교하는거라 실수와 정수 크기 자체는 비교 가능
		str = (avg >= 60) ? "합격" : "불합격" ;
		System.out.println("결과 : " + str);
		
		// 논리연산자(&&(and))
	    char c1 = 'Q' ;
//	    str = (조건식) ? 참일때 : 거짓일때 ;
	    str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자 아님" ; // 
	    System.out.println("결과 : " + str);

	    // 논리연산자(||(or))
	    // 1 또는 3이면 남자, 아니면 여자 문제의 오류
//	    str = (조건식) ? 참일때 : 거짓일때 ;
	    int gender = 1 ;
	    str = (gender == 1 || gender == 3) ? "남자" : "여자" ;
	    System.out.println("결과 : " + str);
	    
	    // 홀수 이면 남자, 짝수이면 여자
	    gender = 4 ; 
//	    str = (조건식) ? 참일때 : 거짓일때 ;
	    str = (gender % 2 == 1) ? "남자" : "여자"  ;	    
	    System.out.println("결과 : " + str);
	    
	    // 3의 배수인지 아닌지 맞춰라
	    int su1 = 157 ;
	    str = (su1 % 3 == 0) ? "3의배수다" : "3의배수가 아니다" ;
	    System.out.println("결과 : " + str);
	    
	    //근무시간이 8시간까지는 시간당 9620 이고
	    // 8시간을 초과한 시간 만큼은 1.5배를 지급한다.
	    // 현재 근무한 시간이 10이다.
	    // 얼마를 받아야 하는가?
	    
	    int w = 10 ;   // 내가 일한 시간
	    int si = 9620 ; // 시간당 금액
	    int res = 0 ;
	    res = (w > 8) ? (8 * si) + (int)((w - 8) * (si*1.5)) : (w * si) ;
	    
	    System.out.println("결과 : " + res);
	    
//	    str = (야간수당 받는기준) ? 야간 수당을 받게되는 금액 : 일반수당 ;
	    
	    int num1 = 47 ;
	    int num2 = 32 ;
	    int res2 = (num1 > num2)  ? num1 : num2  ; // 2개 비교해서 큰거 찾기
	    int res3 = (num1 - num2 > 0)  ? num1 : num2  ; // 2개 비교해서 큰거 찾기
	    System.out.println("큰값 : " + res2);
	    
	    
	    // Math 클래스에 있는 메서드 10개 조사하기 
	    int res4 = Math.max(num1, num2 ) ; //단점 2개밖에 비교 못함
	    System.out.println("큰값 : " + res4); 
	    
	    int res5 = 38 ;
	    int res6 = (res5 > 0) ?  res5 : res5*-1 ;
	    System.out.println("결과 : " + res6);
	    
	    int res7 = Math.abs(res5) ;
	    System.out.println("결과 : " + res7);
	}

}
