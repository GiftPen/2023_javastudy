package day18.com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 => toArray();
		// 배열을 컬렉션으로 => Arrays.asList();
		
		String[] str = {"java","Java","JAVA","자바"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		for (String k : str) {
			set1.add(k);
		}
		System.out.println("set1 =" +set1);
		System.out.println();
		
		// set1의 모든 요소를 set2에 넣어주세요(addAll());
		set2.addAll(set1);
		
		System.out.println("set2 =" +set2);
		System.out.println();
		
		// 삭제: clear(), remove(Object o)
		// 비어있는지 확인: isEmpty();  비어있으면 트루 안비어있으면 false
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));
		System.out.println(set2.remove("jaVA"));  // 없는놈이라 삭제 안되서 펄스
		System.out.println("===================="); 
		
		// 중복불가
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		System.out.println(set2.add("JAVA")); // 이미 들어간거라 false
		System.out.println(set2);// 오류는 아닌데 안 넣어짐
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
