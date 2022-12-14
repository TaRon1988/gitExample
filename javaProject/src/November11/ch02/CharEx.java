package November11.ch02;

public class CharEx {

	public static void main(String[] args) {

		char aValue = '\u0041';//역슬래쉬u는 유니코드를 이용하겠다고 선언하는 것이다.u0041은 A이다
		System.out.println("char형('\u0041'):"+aValue);

		char bValue = '\u0041';//역슬래쉬u는 유니코드를 이용하겠다고 선언하는 것이다.u0041은 A이다
		System.out.println("char형(\'\\u0041\'):"+bValue);
		// \'= single quote를 표현
		//	\\=	역슬래쉬를 유니코드 표현
		// 역슬래쉬 = / = 백슬레쉬

	}

}
