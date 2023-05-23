package day12.com.ict.edu;

public class Ex02_get_set {
	
	// 직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동" ;      //<- 전역변수
	private int age = 24;
	private double weight = 72.6 ;
	private boolean gender = true ;
	
	
	// get()/set()를 이용 
	public String getName() {
		return name;
	}
	// 지역변수와 전역변수 이름이 같으면
	// 전역변수에 this를 붙인다
	// 지역변수가 전역변수보다 우선 순위가 높다.
	public void setName(String name) {  // <- 지역변수
		this.name = name; // 전역변수와 지역변수의 이름이 같으면 전역변수에 해당하는것 앞에 this.을 붙여라
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// boolean 형만 get 자리에 is 가 온다
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
}