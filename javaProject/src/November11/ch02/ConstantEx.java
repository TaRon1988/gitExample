package November11.ch02;

public class ConstantEx {

	public static void main(String[] args) {
		//final을 선언해서 변수의 상수 처리
		final double KM_PER_MILE = 1.609344;//상수: 변하지 않는 값, 상수의 변수명은 되도록 대문자로 표시
		double km;
		double mile = 60.0;
		km = KM_PER_MILE*mile;
		
		System.out.println("60마일은"+km+"킬로미터 입니다.");
		
	}
}
