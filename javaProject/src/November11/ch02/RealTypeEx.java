package November11.ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d= 0.1234d;//double 뒤에는 D나 d를 써야하긴 하지만 생략 가능
		double e = 1234E-4;//1234*10-4 = 0.1234와 동일
		float f = 0.1234f; //float형 만큼은 숫자 뒤에 F나 f를 꼭 명시해야 한다
		double w = .1234D;//점 앞에 0이상의 숫자를 생략 가능하다 .1234=0.1234
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
		
		
		
	}

}
