package day15.com.ict.edu2;

public class Ex04_Dog extends Ex04_abstract {
	String name = "개똥이" ;
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	// 반드시 해야할 것들은 추상으로 하는경우가 있다.(무조건 하게 만들려고)
	// 위와 아래의 차이는 위는 반드시 해야하는것이고 아래는 안해도 된다
	// 위는 안할시 오류가남
	@Override
	public void play() {
		System.out.println("바다에서 놀기");
	}	
	
	public String getName() {
		return name;
	}
	
}
