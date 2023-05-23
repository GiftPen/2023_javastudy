package day18.com.ict.edu;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		// 로또 : 1 ~ 45, 랜덤, 중복안됨, 6자리
		TreeSet<Integer> lotto = new TreeSet<>();
		
		
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*45)+1 ;
			
			// 안들어가지면 (들어가는걸 !로 부정해서 true로 되게끔) -> 중복된다면 
			if(! lotto.add(su)) {
				i--;
			}
		}
		System.out.println(lotto);
		
		
		
	}
}
