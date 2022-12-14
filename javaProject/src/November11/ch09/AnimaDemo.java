package November11.ch09;

class Animal{
	public Animal (String s) {
		System.out.println("동물: "+s);
		
	}
}
class Mammal extends Animal{
	public Mammal() {//기본 생성자
		super("원숭이");//부모 클래스 생성자 호출
		System.out.println("포유류:원숭이");
	}

	public Mammal(String s) {//매개 변수가 있는 생성자
		super(s);//부모 클래스 생성자 호출
		System.out.println("포유류 : "+s);
	}
}

public class AnimaDemo {//퍼블릭은 하나만 있어야 한다.

	public static void main(String[] args) {
		Mammal ape = new Mammal();//객체 생성 겸 기본 생성자 호출
		Mammal lion = new Mammal("사자");//객체 생성 겸 매개 변수가 있는 생성자 호출
		

	}

}
