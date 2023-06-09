package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리한다.
		// 형식) for(초기식; 조건식;  증감식) {
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//        }
		//   **  for문을 만나면 무조건 초기식으로 이동
		//	초기식은 조건식으로 이동
		//	조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		//  for문의 끝을 만나면 무조건 증감식으로 간다.
		
		//  {}에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용불가)
		
		// 안녕하세요를 열번 출력하기
		for (int i = 1; i < 11; i++) { // 11 <-안하게 되는 값
			
			System.out.println(i + " = 안녕하세요");
			
		}
		
		//  0~10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
			
		}  
		System.out.println();  // 줄 바꿈
		//  0~10까지 짝수만 출력
		for (int i = 0; i < 11; i = i+2 ) {
			System.out.print(i + " ");
			
		}
		System.out.println();  // 줄 바꿈
		
		for (int i = 0; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		
	
		
		}
		System.out.println();  // 줄 바꿈
		// 구구단 중 7단 출력
		for (int i = 1; i <10 ; i++) {
			System.out.println("7*"+ i + "=" + (7*i)); // **변하는것과 변하지 않는것을 찾는게 중요
			
		}
		
		// 1 ~ 10 누적합(합계 구하기)   // 누적합공식: 이전저장 = 이전저장 + 현재값
		// 누적합 : 이전저장변수 = 이전저장변수 + 현재값 ; 이때 이전저장변수 = 0
		
		//이전저장변수 = 1
		// 누적합 : 이전저장변수 = 이전저장변수 * 현재값 ;
		
		
		int sum = 0 ;
		for (int i = 1; i <11 ; i++) {
			sum = sum + i ; 
			
		}
		System.out.println("누적합 : " + sum);
		System.out.println("=============================");
		
		// 0 ~ 10까지 짝수의 누적합
		int even = 0 ;
		for (int i = 0; i < 11 ; i++) {
			if(i % 2 == 0) {
				even = even + i ;
			}
		}
		
		System.out.println("짝수의 누적합 : " + even);
		
		// 7!(팩토리) 구하기
		int gop = 1 ;
		for (int i = 7; i > 0 ; i--) {
			gop = gop * i ;
		}
		System.out.println("7!(팩토리) = " + gop);
		System.out.println("=============================");
		
		// 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		// For 문을 이용한 누적합
		//과제
		
		int mo = 0 ;
		for (int i = 1; i < 11 ; i++) {
			if (i % 2 == 1) {
				mo = mo + i ;
			} else {
				mo = mo + (i*(-1)) ;
			}
			
		}
		System.out.println(mo);
	}
		
}
