package November11.ch12;
interface RemoteControl{// 이 기법은 자주 사용
	//추상 메소드
	void trunOn();
	void trunOff();
}
public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {//눈에 보이지 않는 
			//무명 클래스 선언
			//추상 클래스나 interface는 new해서 객체 생성을 못한다. 
			//하지만 무명 클래스 처리하면
			//자동적으로 interface인 RemoteControl을 
			//무명 클래스가 상속 받아 오버라이딩 할 수 있다.

			@Override
			public void trunOn() {
				System.out.println("TV turn On()");
			}

			@Override
			public void trunOff() {
				System.out.println("TV turn Off()");
				
			}			
		};//무명 내부 클래스
		ac.trunOn();
		ac.trunOff();
		}
}
