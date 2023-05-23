package day13.com.ict.edu;

public class Ex03_static {
	// static 초기화
	// static{
	//      초기화 내용
	//    }
	
	int s1 = 100 ;
	private int p1 = 100 ;
	static int s2 ;
	
	public static int k1 = 100 ;
	// 디폴트 같은 패키지는 접근 허용 가능 하나
	// 다른 패키지는 접근을 할 수 없다.(접근 제한자가 우선순위가 높다)
	static int k2 = 100 ;  // 앞에 아무것도 없으면 디폴트
	private static int k3 = 100 ;
	// 초기화
	static {
		m1 = 1000 ;
		m2 = 1000 ;
		s2 = 1000 ;
		k2 = 1000 ;
		
	}
	
	// 생성자는 인스턴스 초기화 목적
	public Ex03_static() {
		s1 = 200 ;
		s2 = 400 ;
		s3 = 500 ;
	}
	int s3 ; 
	// 
	static int m1 ; // 선언을 나중에 했는데 오류가 안남( 초기화 목적이있는애들은) 
	static int m2 = 500 ; // 초기화 기준은 위에는 바뀌나
	// 밑에 있는경우 값이 없을경우 넣어주거나 값이 있다면 변경이 안된다
	// 최종 m1 값은 1000이다
	// 최종 m2 값은 500이다
	// 알고만 있자
	
	
	
	
}	
