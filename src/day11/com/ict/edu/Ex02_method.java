package day11.com.ict.edu;

public class Ex02_method {
	String name = "홍길동";
	int kor = 90 ;
	int eng = 80 ;
	int math = 80 ;
	int sum = 0 ;
	double avg = 0.0;
	String hak = "";
	// 모두 void 
	// 총점 구하는 메서드
	public void getSum() {
		// int sum = kor + eng + math ; //전역변수가 아닌 지역변수는 블록을 나가면 없는게 된다
		sum = kor + eng + math ;
		//System.out.println("총점 : " + sum); // 이렇게 안에서 해결 가능하면 전역변수 안써도 됨
	}  // 이렇게 할수도 있다는것만 알기
	
	
	// 평균 구하는 메서드
	public void getAvg() {
		avg = sum /3 ;
		//System.out.println("평균 : " + avg);
	}
	
	
	
	// 학점 구하는 메서드
	public void getHak() {
		if (avg >=90) {
			hak = "A" ;
		} else if (avg >=80) {
			hak = "B" ;
		} else if (avg >=70){
			hak = "C" ;
		} else {
			hak = "F" ;
		}
		//System.out.println("학점 : " + hak);
		
		
	}
	
	
	
	
	
	
}
