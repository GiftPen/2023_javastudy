package day09.com.ict.edu;

public class Ex11_Array {
	public static void main(String[] args) {
		int[][] arr = new int[5][5] ;
		
		         //번호 , 총점, 평균 , 학점, 순위   
		int[] p1 = {1, 270, 90, 'A', 1};
		int[] p2 = {2, 210, 70, 'C', 1};
		int[] p3 = {3, 180, 60, 'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 285, 95, 'A', 1};
		
		// 1차월 배열을 다차원배열에 넣자
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		// 순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;   //자기자신 제외 라는뜻
				}  if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		
		
		
		// 순위로 오름차순 정렬해서 
		//int[][] bin = new int[5][5] ;   // 빈자리가 필요해
		int[] bin = new int[5]; 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {   // 오름차순
					bin = arr[i];
					arr[i] = arr[j];
					arr[j] = bin ;
				}
			}
		}
		
		
		// 출력 등수대로
		System.out.println("번 호\t총점 점\t평 균\t학 점\t 순 위 ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)(arr[i][j])+ "\t");
				}else {
				System.out.print(arr[i][j]+ "\t");
				}
			}
			System.out.println();
		}
		System.out.println("===================");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][0]+ "\t");
			System.out.print(arr[i][1]+ "\t");
			System.out.print(arr[i][2]+ "\t");
			System.out.print((char)arr[i][3]+ "\t");
			System.out.print(arr[i][4]+ "\t");
			System.out.println();
		}
//		 {1, 270, 90, 'A', 1};
//    	 {2, 210, 70, 'C', 1};
//		 {3, 180, 60, 'F', 1};
//	     {4, 300, 100, 'A', 1};
//		 {5, 285, 95, 'A', 1};
		
		
	}

}
