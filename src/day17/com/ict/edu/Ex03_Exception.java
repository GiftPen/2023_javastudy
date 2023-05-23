package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행 해야 되는 문장을 처리할때 사용
//			 주로 데이터베이스, 입/출력, 네트워크에서 사용
//			형식 : try{
//				예외 발생 가능한 문장들;
//				예외사 발생 되면 아래 문장들을 무시하고, catch문으로 이동한다.	
//				예외 발생 가능한 문장들;
//				예외 발생 가능한 문장들;
//				}catch(발생한 예외 객체 e){
//					예외 발생시 처리하는 문장;
//				}
//				}catch(발생한 예외 객체 e){
//					예외 발생시 처리하는 문장;
//				}
//				}catch( Exception e){ Exception을 사용할 경우 반드시 가장 아래
//					예외 발생시 처리하는 문장;
//				}finally{
//					반드시 실행 해야되는 문장;
//				}
public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {

			int su1 = 50;
			System.out.print("정수 입력 : ");
			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1 / su2));
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
			//return; // 설명할라고 리턴 써본거, 보통 여기 잘 안씀
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
			//return; // jvm으로 돌아가고 '수고하셨습니다'는 수행 안하고 끝이지만 파이널은 끝까지 실행
		}finally {
			System.out.println("반드시 수행되는 문장");
			scan.close();// 닫는걸 항상 마무리로 해주는게 좋다
		}
		System.out.println("수고하셨습니다.");
		
	}
}
