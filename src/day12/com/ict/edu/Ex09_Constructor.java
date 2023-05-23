package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_Constructor {
	Scanner scan = new Scanner(System.in);
	
	private String name = "";
	
	private int kor = 0 ;
	private int eng = 0 ;
	private int math = 0;
	private int sum = 0 ;
	private double avg = 0 ;
	private String hak = "";
	private int rank = 0 ;
	
	public Ex09_Constructor(String name,int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		getSum();	
		}
	public Ex09_Constructor(int sum) {
		this.sum = sum;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		sum = kor + eng + math ;
		getAvg();
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
		
	}
	public String getHak() {
		if(avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		return hak;
	}
	public void setHak(String hak) {
		if(avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAvg() {
		avg = (int)(sum/3.0*10)/10.0 ;
		getHak() ;
		return avg;
	}
	public void setAvg(double avg) {
		
		this.avg = avg;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
