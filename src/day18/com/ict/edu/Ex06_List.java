package day18.com.ict.edu;

import java.util.Iterator;
import java.util.Stack;



public class Ex06_List {
	// List 인터페이스 : 배열과 흡사한 구조
	//				 삽입, 삭제, 추가가 자유롭다.
	//				 크기를 미리 지정하지 않아도 된다.
	//	List  인터페이스를 구현한 클래스 : Stack, ArrayList,Vecctor
	// Stack : LIFO(Last In First Out)  //중요한구조     
	//		  마지막에 들어온 데이터가 먼저 나가는 형태
//		ㅡ
//		ㅇ     <- 이쪽에서 밀면 엎어진 느낌
//		ㅡ
//		ㅁ
//		ㅡ
//		ㅅ
//		ㅡ
	//   =>   |ㅇ|ㅁ|ㅅ|
	
	// add. push, addElement => 추가
	// add(index, E) => 삽입
	// pop : 맨 위에 존재하는 객체를 반환하고 삭제한다.
	// peek : 맨 위에 존재하는 객체를 반환, 삭제 안함. 
	// search : 검색(오른쪽, 1부터시작) => 스택관점        |ㅁ|ㅁ|ㅁ|ㅁ|ㅁ| <-여기서부터 시작  1부터
	// **indexOF : 검색 (왼쪽, 0부터) => 배열관점 		여기서부터 시작 0부터	->   |ㅁ|ㅁ|ㅁ|ㅁ|ㅁ| 
	// elementAt(index) : 요소 반환
	// **get(index)     : 요소 반환
	// firstElement()   : 맨 처음 요소 반환
	// lastElement()    : 마지막 요소 반환
	// setElement(Element, index) : 치환
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이클");
		
		stack.add(0,"고길동");  // 자리 지정해서 사이에 넣기 ,삽입
		stack.add(2,"희동이");  // 자리 지정해서 사이에 넣기 , 삽입
		
		System.out.println(stack);
		// 마지막 객체 보기 : pop(삭제),peek(삭제 안함)
		System.out.println();
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println();
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		if (stack.contains("둘리")) {  // 둘리가 있으면 트루
			// 둘리 위치 찾기
			System.out.println(stack.indexOf("둘리")); // 왼쪽이면 0부터
			System.out.println(stack.search("둘리"));  // 오른쪽이면서 1부터
			
			
			// 위치값을 이용해서 객체 얻기
			System.out.println(stack.get(1));
			System.out.println(stack.elementAt(1));
			System.out.println(stack.get(stack.indexOf("둘리"))); // 둘리 위치값으로 둘리를 뺴네자
		}else {
			System.out.println("존재하지 않음");
		}
		
		if(stack.contains("고길동")) {
			// 치환
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
			System.out.println(stack);
			
			
			// 중복 가능
			stack.add("둘리");
			stack.add("고딜동");
			System.out.println(stack);
			
			// 하나씩 꺼내기 (배열, 왼쪽, 0부터)
			for (String k : stack) {
				System.out.println(k+"님");
			}
			
			Iterator<String> it = stack.iterator();
			while (it.hasNext()) {
				String k = (String) it.next();
				System.out.println(k + "짱");
				
			}
			System.out.println();
			// 스택방식으로(오른쪽)
			while (! stack.isEmpty()) {  // 안비었으면 (비었으면의 반대)
				String k = stack.pop();
				System.out.println(k + ", 크기는" + stack.size() + "이다.");
			}
			System.out.println(stack);
			
			
	}
}
