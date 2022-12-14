package November11.ch16;

//멀티스레드 : 작업단위가 2개 이상
//멀티스레드를 구현하는 방법
//1)Thread를 상속
//2)Runnable을 구현
public class ThreadExam1 extends Thread {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		t1.start();//스레드.start()==>run()이 자동 호출됨
		t2.start();//위와 동시에 호출
	}

}
