package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_method t1 = new Ex02_method() ;
		
		System.out.println("==== 메서드 실행하기전 ==");
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
		
		System.out.println("==== 메서드 실행후 ====");
		t1.getAvg();
		//System.out.println("평균 : " + t1.avg); // sum이 변경이 안됬어
		t1.getSum();
		t1.getAvg();
		t1.getHak();
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
	}

}
