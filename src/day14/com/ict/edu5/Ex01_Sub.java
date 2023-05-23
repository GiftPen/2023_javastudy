package day14.com.ict.edu5;

public class Ex01_Sub extends Ex01_Super{
	int weight = 35 ;
	
	@Override  //  <- 어노테이션(과제 알아보기)
	public void sound() {
		System.out.println("음악소리"); // 부모것을 숨김으로써 정보은닉이라고 부른다
	}
	
	public void hobby() {
		System.out.println("잠자기");
	}
	
}
