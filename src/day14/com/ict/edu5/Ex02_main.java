package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Dog dog = new Ex02_Dog() ;
		Ex02_Cat cat = new Ex02_Cat() ;
		
		
		dog.sound();
		dog.hobby();
		System.out.println(dog.eyes);
		System.out.println(dog.color);
		System.out.println();
		// 부모것이 숨겨진다
		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();
		
//-------------------------------------------------------------------------
		// 객체생성을 부모클래스로 해버리면
		// 부모클래스 변수 = new 자식클래스 생성자();
		// 객체 다형성
		Ex02_Animal animal = null;
		int su =1 ;
		if(su == 1){  // 고양이
			animal = new Ex02_Cat();
   		}else if(su == 2) { 	// 강아지
   			animal = new Ex02_Dog();  // 둘다 생성될일은 없다(조건에 따라 생성이라)
		}
		// 오버라이딩 한것은 자식꺼 가능  ,부모와 같은것이 있을떄
		animal.sound();
		// 부모꺼만나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		// 자식클래스만 가지고 있는것은 사용불가
		//animal.play();
	}
}
