package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초 인가?
		
		
		// 3989를 60초로 나눴을때 분이 되고 남은 값은 초가 된다
		// 위계산 값에서 나온 값을 60분으로 나눴을때 시간이 되고 남은 것은 분이 된다.
		
		int qus = 3989 ;  // 문제값
		int s1 = qus % 60 ; //구하고자 하는 초
		int m1 = qus / 60 ;  // 분과 시간을 구하기 위한 총값
		int m2 = m1 % 60; // 구하고자 하는 분
		int h1 = m1 / 60 ; // 구하고자 하는 시간
		
		System.out.println(h1 + "시간"); 
		System.out.println(m2 + "분"); 
		System.out.println(s1 + "초"); 
		
//		//
//		int time = 3989 ;
//		int h = 0 ;  시
//		int m = 0 ;  분
//		int s = 0 ;  초
//		int res = 0 ; 나머지
		
//		h = time / (60*60) ;    // 1    시간 
//		res = time % (60*60) ;  // 389
//		
//	    m = res / 60 ;      // 분
//	    s = res % 60 ;      // 초
//	
		}

}
