package November11.ch03;

public class CastEx2 {

	public static void main(String[] args) {

		int a = 500;
		float b = 200.2F;
		int c =127;
		double d = a;//자동 현변환이 되서 double 타입으로 변환
		System.out.println("int a => double: "+d);
		
		int e = (int)b;//강제 형변환(명시적형변환)
		System.out.println("float b => int: "+e);
		
		byte f = (byte)c;//강제 형변환(명시적형변환)
		System.out.println("int c => byte: "+f);
	}

}
