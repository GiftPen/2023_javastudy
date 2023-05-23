package day05.com.ict.edu;

public class Ex04_whlie {
	public static void main(String[] args) {
		// while문 : for 문과 같은 반복문
		// 형식1)
		//      초기식 ;
		//     while(조건식){
		//		조건식이 참이면 실행할 문장;
		//		조건식이 참이면 실행할 문장;
		// 		증감식;
		//		}
		//		while 문의 끝을 만나면 조건식으로 간다
		
		// 형식2)
		//      초기식 ;
		//     while(true){
		//      if(빠져나갈 조건){
		//
		//         break ;
		//      } //한줄은 블록 생략가능
		//		조건식이 참이면 실행할 문장;
		//		조건식이 참이면 실행할 문장;
		// 		증감식;
		//		}
		//		while 문의 끝을 만나면 조건식으로 간다
		
		// 1 ~ 10까지 출력하기
		int i = 1 ;
		while (i < 11) {
			System.out.println("i = " + i);
			i ++ ;
		}
		
		System.out.println("============================================");
		
		i = 1 ;
		while(true) {
			if(i >= 11) break ;
			System.out.println("i = " + i);
			i++ ;
		}
		// 0~ 10까지 짝수 출력
		 i = 0 ;
		 while (i < 11) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i ++ ;
		}
			System.out.println("============================================");
			System.out.println("구구단 7단");
		// 구구단 중 7단 출력
			i = 1;
		while (i < 10) {
			
			System.out.println(7 + "*" + i + "=" + (7*i));
			i ++ ;
		}
	
		// 1 ~ 10 누적합(합계 구하기)
		i = 1 ;
		int sum = 0 ;
		while (i < 11) {
			 sum = sum + i ;
			i ++ ;
		}
		System.out.println("누적합 : " + sum);
		
		// 0 0 0 0
		// 0 0 0 0 
		// 0 0 0 0 
		// 0 0 0 0 
		int e =1 ;
		i = 0 ;
		while (e < 5) {
			System.out.println(i +" "+ i + " " + i +" "+ i );
			e ++ ;
		}
		System.out.println("============================================");
		i = 1 ;
		
		while (i < 5) {
			int n = 1;
			while (n<5) {
				System.out.print(0*n + " " );
				n++;
			}
			System.out.println();
			 i ++ ;
			 
		}
		System.out.println("============================================");
		i =1 ;
		while(i < 17) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
			i ++ ;
		
		}
		
	}

}
