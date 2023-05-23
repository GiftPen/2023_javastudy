package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원수를 물어본다.
		System.out.print("시험을 본 인원수 : ");
		int su = scan.nextInt();
		
		// 미리 배열을 만든다.
		String[] str = new String[su] ;
		String[] str1 = new String[su] ;
		int[] kor = new int[str.length] ;   //int[] kor = new int[su];  이렇게 해도됨
		int[] eng = new int[str.length] ;     //int[] kor = new int[su];
		int[] math = new int[str.length] ;     //int[] kor = new int[su];
		int[] sum = new int[str.length] ;       //int[] kor = new int[su];
		double[] avg = new double[str.length] ;    //int[] kor = new int[su];
		int[] rank = new int[str.length];
		int i = 0 ;
//		for ( i = 0; i < su; i++) {     // 이렇게 해도됨
//			System.out.print("이름 : ");
//			 str[i] = scan.next();
//			 System.out.print("국어 : ");
//			kor[i] = scan.nextInt();
//			 System.out.print("영어 : ");
//			eng[i] = scan.nextInt();
//			 System.out.print("수학 : ");
//			math[i] = scan.nextInt();
//		
//			sum[i] = kor[i] + eng[i] + math[i] ; 
//			avg[i] = (int)(sum[i]/3.0*10)/10.0 ;
//			if (avg[i] >= 90) {
//				str1[i] = "A학점" ;
//			} else if (avg[i] >= 80) {
//				str1[i] = "B학점" ;
//			} else if (avg[i] >= 70) {
//				str1[i] = "C학점" ;
//			}else {
//				str1[i] = "F학점" ;
//			
//			}
//		    rank[i] = 1 ;
//	}
		while (i < su) {
			
			System.out.print("이름 : ");
			 str[i] = scan.next();
			 System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			 System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			 System.out.print("수학 : ");
			math[i] = scan.nextInt();
			i++;
			System.out.println("============");
		}
		for ( i = 0; i < sum.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i] ;
			avg[i] = (int)(sum[i]/3.0*10)/10.0 ;
			
			if (avg[i] >= 90) {
				str1[i] = "A학점" ;
			} else if (avg[i] >= 80) {
				str1[i] = "B학점" ;
			} else if (avg[i] >= 70) {
				str1[i] = "C학점" ;
			}else {
				str1[i] = "F학점" ;
			}
			
			
		}
		for ( i = 0; i < sum.length; i++) {
			rank[i] = 1 ;
			for (int j = 0; j < sum.length; j++) {
				if(i == j) continue;
				if(sum[i] <sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("이 름\t총점 점\t평 균\t학 점\t 순 위 ");
		for ( i = 0; i < sum.length; i++) {
			System.out.print(str[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(str1[i] + "\t");
			System.out.print(rank[i]  + "\t");
			System.out.println();
		}
		
		
	}

}
