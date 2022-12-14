package November11.ch12;

public class LocalOuter {
	private int data=30;
	void display() {//LocalOuter 의 멤버 메소드
		//메소드 안에 클래스를 선언하는 경우는 이례적인 일이다.
		class LocalInner{//지역 내부 클래스(메소드 안에서 선언)
			void msg() {//LocalInner의 멤버 메소드
				System.out.println(data);
			}
		}//end inner class
		LocalInner li=new LocalInner();//내부 객체 생성
		li.msg();
	}//end method
	public static void main(String[] args) {
		LocalOuter lo=new LocalOuter();
		lo.display();
	}

}
