package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super{
	String name = "홍반장";
	int age = 13 ;
	double weight = 78.4 ;
	
	// this(); : 자기자신의 생성자를 뜻함
	//			 생성자의 첫번째줄에 있어야 다른생성자 호출
//	public Ex01_Sub() {
//		this("홍두께",14);
//	}
	
	
	// super() : 부모클래스의 생성자를 뜻한다. 무조건 첫번째줄 
	// 자식클래스 생성자 첫줄에 부모클래스 생성자가 숨어 있다.
	public Ex01_Sub() {
		this("kkk", 14); //super 와 this는 같이 못써 아래를 이용해서 쓰는방법
		//super("서울 마포구");
		//super();숨어있다     부모의 기본생성자 ,부모에 생성자가 없거나 기본생성자가 없다면 다른생성자가 있다면
								// 오류가 발생하게 된다
	}
	
	public Ex01_Sub(String name, int age) {
		super();
		this.name = name ;
		this.age = age ;
	}
	
}
