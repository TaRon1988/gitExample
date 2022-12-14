package November11.ch12;

class Outer{
	class InstanceInner{//내부클래스
		int a=100;//non - static 멤버
	}
	static class StaticInner{//static내부클래스
		int a =200;//non - static
		static int b=300;//static
	}
	void myMethod() {//Outer멤버 메소드
		class LocalInner{//지역중첩클래스
			int a = 400;//non - static
		}
		LocalInner i =new LocalInner();
		System.out.println("i.a:"+i.a);
	}//end method
}
public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc=new Outer();//외부 클래스 생성
		Outer.InstanceInner i =oc.new InstanceInner();//내부 클래스 생성
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b"+Outer.StaticInner.b);

		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+si.a);//non-static멤버는 static클래스 안에 있더라도 반드시 new를 통해 생성 한 후에 사용해야 한다.
		
		oc.myMethod();
	}

}
