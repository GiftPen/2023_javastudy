package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		int su = 3781 ; // 문제값
		
		// 결과
		// 천의 자리 : 3 
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		int t = su / 1000; // 천의 자리
		int t1 = su % 1000 ; // 나머지
		int h = t1 / 100; // 백의 자리
	    int h1 = t1 % 100 ; // 나머지
	    int ten = h1 / 10 ; // 십의 자리
	    int one = h1 % 10 ; // 일의 자리
	    System.out.println("천의 자리 : " + t);
	    System.out.println("백의 자리 : " + h);
	    System.out.println("십의 자리 : " + ten);
	    System.out.println("일의 자리 : " + one);
	    
	    
//	    
//	    int su = 3781 ;
//	    
//	    int c = 0 ;
//	    int b = 0 ;
//	    int s = 0 ;
//	    int i = 0 ;
//	    int res = 0;
//	    
//	    c = su / 1000 ;  // 3
//	    res = su % 1000 ;  // 781
//	    
//	    b = res / 100 ; // 7
//	    res = res % 100 ;	 // 81
//	    
//	    s = res / 10 ; // 8
//	    i = res % 10 ; // 1
	    		
	    	
	    	
		
		
		
		
	}

}
