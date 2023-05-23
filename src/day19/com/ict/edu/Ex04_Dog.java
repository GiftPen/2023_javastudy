package day19.com.ict.edu;

public class Ex04_Dog implements Runnable{

	@Override
	public void run() {
		while (true) {
			//3초간 대기상태 만들기
			try {
				Thread.sleep(1000*3); //1000이 1초 -> 무조건 트라이 캐취
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			System.out.println("멍~~멍~~");
		}
	}

}
