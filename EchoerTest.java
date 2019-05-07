import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}

	abstract void echo();

	void stop() {
		System.out.println("종료합니다.");
	}
}

public class EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Echoer e = new Echoer() {
			public void echo() {	// 무명 지역 클래스 정의
				while(true) {
					String sen = in.nextLine();		// 메시지를 한 줄(개행문자,엔터)을 기준으로 입력을 받음
					System.out.println(sen);
					if(sen.equals("종료"))
						break;				// "끝"이라는 메시지를 입력받으면 반복문을 종료함
				}
			}
		};
		
		e.start();
		e.echo();
		e.stop();

		System.out.println("Hello!");
	}
}
