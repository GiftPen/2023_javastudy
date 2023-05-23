package day11.com.ict.edu;

import java.util.Scanner;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		// 객체생성
		Ex05_Animal t1 = new Ex05_Animal();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String k1 = sc.next();
//		// 이름 : 큰뿔소 변경
//		t1.getName(k1);
//
//		// 나이는 3살 변경
//		System.out.print("나이 : ");
//		int k2 = sc.nextInt();
//		t1.getAge(k2);
//		// 생존여부 살아있음
//		t1.getLive1();
//		// 결과 출력
//		System.out.println("이름 : " + t1.name);
//		System.out.println("나이 : " + t1.age);
//		System.out.println("생존여부 : " + t1.live);
//		System.out.println("==================");
//		// 이름을 펭귄으로 바꾸고, 나이를 1살, 생존여부는 살아있음 으로 변경
//		System.out.print("이름 : ");
//		k1 = sc.next();
//		t1.getName(k1);
//		System.out.print("나이 : ");
//		k2 = sc.nextInt();
//		t1.getAge(k2);
//		t1.getLive1();
//		// 결과 출력
//		System.out.println("이름 : " + t1.name);
//		System.out.println("나이 : " + t1.age);
//		System.out.println("생존여부 : " + t1.live);
//
//		System.out.println("======================");
//		// 스캐너 안쓴버전
//		// 객체생성
//
//		// 이름 : 큰뿔소
//		k1 = "큰뿔소";
//		t1.getName(k1);
//
//		// 나이는 3살
//		;
//		k2 = 3;
//		t1.getAge(k2);
//		// 생존여부 살아있음
//		t1.getLive1();
//		// 결과 출력
//		System.out.println("이름 : " + t1.name);
//		System.out.println("나이 : " + t1.age);
//		System.out.println("생존여부 : " + t1.live);
//		System.out.println("==================");
//		// 이름을 펭귄으로 바꾸고, 나이를 1살, 생존여부는 살아있음 으로 변경
//
//		k1 = "펭귄";
//		t1.getName(k1);
//
//		k2 = 1;
//		t1.getAge(k2);
//		t1.getLive1();
//		// 결과 출력
//		System.out.println("이름 : " + t1.name);
//		System.out.println("나이 : " + t1.age);
//		System.out.println("생존여부 : " + t1.live);

		// 이름 : 큰뿔소 변경
		t1.setName("큰뿔소");
		// 나이는 3살 변경
		t1.setAge(3);
		// 생존여부 살아있음 변경
		t1.setLive(true);
		// 결과 출력
		//System.out.println("이름 : " +t1.getName2());
		String m1 = t1.getName2() ;   // 저장 먼저 하고 하는게 맞다
		System.out.println("이름 : " + m1);
		
		
		int m2 = t1.getAge2() ;
		System.out.println("나이 : " + m2);
		
		boolean m3 = t1.getLive2() ;
		
		if(m3) {
			System.out.println("생사여부 : 살았다");
		}else {
		System.out.println("생사여부 : 죽었다");
		}
		
		
		
		// 이름을 펭귄으로 바꾸고, 나이를 1살, 생존여부는 살아있음 으로 변경
		t1.setName("펭귄");
		t1.setAge(1);
		t1.setLive(true);
		
		String p1 = t1.getName2() ;   // 저장 먼저 하고 하는게 맞다
		System.out.println("이름 : " + p1);
		
		
		int p2 = t1.getAge2() ;
		System.out.println("나이 : " + p2);
		
		boolean p3 = t1.getLive2() ;
		
		if(p3) {
			System.out.println("생사여부 : 살았다");
		}else {
		System.out.println("생사여부 : 죽었다");
		}
		System.out.println("===================");
		t1.play(false, 14, "엄지");
		t1.prn();
		
		System.out.println("===================");
		t1.play("까치", 14, true);
		t1.prn();
	}
}
