package day05.com.ict.edu;

public class Ex05_ex {
	public static void main(String[] args) {
		/*1. if~ else문 
		농구공 5개씩 한 박스에 들어간다. 
		 40개면 8상자,  26개면 6개이다.
		int k1 = 127개이다. 
		몇 상자가 필요한가요?
		

		2.  for 문으로 플기 
		0 0 0 0 
		0 0 0 0
		0 0 0 0
		0 0 0 0

		3.  이중 for 문으로 풀기 
		1  0  0  0
		0  1  0  0
		0  0  1  0
		0  0  0  1

		4.   1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,    몇까지 더해야 총합이 100이상이 되는지 구하시오

		5.    5,6번 둘다 포문으로
		*
		* *
		* * *
		* * * *
		
		
		6. 별찍기
		      *
		    * *
		  * * *
		* * * *
		 
		*/
		int k1 = 127 ;  //5 개당 1박스 6개면 2박스
		int box = 0 ;
		if (k1 % 5 == 0) {
			box = k1 / 5 ;
		} else {
			box = (k1 / 5) + 1 ;
		}
		System.out.println("필요한 상자 개수 : " + box);
		System.out.println("==========================");
		
		//for(초기식; 조건식;  증감식) {
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//            조건식이 참일때 실행할 문장;	
		//        }
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
			
		}
		
		
		
		
		//4.   1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,    몇까지 더해야 총합이 100이상이 되는지 구하시오
		int i = 1;
		   for ( int sum = 0; sum < 100; sum= sum +i) {
			   			
				 for (i = 1; i > 0; i++) {
					if(i % 2 == 1) {
						sum = sum + i ;
					} else {sum = sum + (i*(-1)) ;
					}
				}
					
				
					
				
			
		   
			
		   }
	}

}
