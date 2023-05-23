package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		// 자식으로 객체를 받았으니
		System.out.println(cat.eyes);  // 자식에 없으니 부모꺼 갖다쓰고
		System.out.println(cat.color);// 자식에 있으니 자식꺼를 쓴다
		
		cat.sound(); //- >오버라이딩
		cat.hobby();
		cat.sleep();
		cat.play();
	}
}
