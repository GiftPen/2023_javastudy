package day20.com.ict.edu;

// 임계영역 : 멀티 스레드에서 공통으로 사용되는 영역
//		    현재 실행중인 스레드가 다른 스레드에게 제어권을 뺴앗긴다.
//			이러한 경우 실시간 처리에서는 문제가 발생 할 수 있다.(EX 티켓팅 할때 결제가 겹치는경우가 발생해선 안돼)
//			이를 해결하기 위한 방법이 동기화 처리이다.

// 동기화 처리 : 임계영역에 synchronized 예약어를 사용함으로써
//			  현재 실행 중인 스레드가 끝날때 까지 다른 스레드 접근 불가
public class Ex02_synchronized {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test,"dog").start();
		new Thread(test,"cat").start();
		new Thread(test,"tiger").start();
		new Thread(test,"lion").start();
	}
}
