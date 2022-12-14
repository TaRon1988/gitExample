package November11.ch03;

public class CastEx {

	public static void main(String[] args) {
		float f = 1.6F; //float는 4바이트로 저장 됨
		System.out.println(f);
		
		f = 100;//자동 형변환(정수100을 자동으로 float형 실수100.0f로 자동 변환)
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f;//강제형변환
		System.out.println(i);
		
		
	}

}
