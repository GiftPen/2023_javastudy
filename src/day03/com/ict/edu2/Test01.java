package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가 
		// 국어 90, 영어 80 , 수학 80 점이다.
		// 총점과 평균을 구하자
		// 화면 출력은 이름, 총점, 평균만 출력하자
		// (단,  평균은 소수점 첫재자리 까지 구하자)
		
		int kor = 90;   // 문제값
		int eng = 80;   // 문제값
		int math = 80;  // 문제값
		String name = "홍길동" ; // 문제값
		
		int sum = kor + eng + math ;
		double avg1 = sum/3.0 ;
		double avg2 = (int)(avg1*10)/10.0 ;
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg2);
		System.out.println("============================");
		
		//  입력정보 : 원하는 정보를 얻기 위한 정보 (재료)
//		String name1 = "홍길동" ;
//		int kor1 = 90 ;
//		int eng1 = 80 ;
//		int math1 = 80 ;
		
		//총점과 평균
//		int sum1 = kor + eng + math ;
//		double avg3 = (double)(sum) / 3 ;
//		double avg4 = (int)(avg3*10)/10.0 ;
		
		// 아룸, 총점, 평균
//		System.out.println("이름 : " + name);
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg4);
//		
	}

}
