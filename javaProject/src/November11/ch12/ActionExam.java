package November11.ch12;
abstract class Action{//추상 클래스 = 하나 만들면 최소 하나 
	//추상 메소드를 만들어야 한다.
	public abstract void exec();//추상 메소드
}
public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I am Chid");
	}
	public static void main(String[] args) {
		Action a =new ActionExam() {//익명 내부 클래스
			String name = "kim";
			@Override
			public void exec() {
				System.out.println("나는"+name+"이다");
				
			}
			
		
	};//주의점: 익명 내부클래스의 마지막 중괄호 다음에는 세미콜론이 (;)이 명시되어야 한다.
a.exec();
}
}
