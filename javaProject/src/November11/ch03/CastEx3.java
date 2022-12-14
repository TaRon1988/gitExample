package November11.ch03;

public class CastEx3 {

	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		System.out.println("x/y="+x/y);
		//System.out.printf("x/y=%.1F",x/y);
		System.out.printf("x/y="+(double)x/y);
		System.out.printf("x/y=%.1F",(double)x/y);//에러 코드
		//printf에서는 결과값에 따르는 실수형 포맷등을 잘 써야 한다
	}

}
