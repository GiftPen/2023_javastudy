package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2 시간 40분 30초는 몇 초 일까요?
		
		
		
		
		
		// 1분은 60초 1시간은 3600분
		// 시간을 넣으면 초로 분을 넣으면 초로 
		// 최종 결과값은 int로 
		// 2시간 곱하기 60을 하면 120분
		// 1시간의 값이 60분을 초과 하면 안됨
		int h1 = 2 ;  //문제값
		int m1 = 40 ;  // 문제값
		int s1 = 30 ;  // 문제값
		
		int m2 = h1 * 60 ;
		int m3 = m1 + m2 ;
		int s2 = s1 + (m3 * 60) ; //구하고자 하는값
		
		System.out.println(s2 + "초");
		
		
		
		// int h = 2 * 60 * 60;  => 시간을 초로
		// int m = 40 * 60 ;  => 분을 초로
		// int s = 30 ;
		// int reasult = h + m + s ;
//		System.out.println("2시간 40분 30초는 " + result + "초 입니다.");
		
	}

}
