package November11.ch02;

import java.util.Scanner;
//java.lang 패키지는 기본패키지로 import를 안해도 되지만 그외에 패키지는 import라는 것을 해야한다.

//키보드로부터의 사용자 입력 프로그램
public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl +Shift +O: 자동 import를 해주는 hot key
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값 ?");//안내 문구
		System.out.println("이름을 입력하세요 : ");
		int x = in.nextInt();//정수 값을 키보드로부터 받아 처리하는 메소드
		System.out.println("두번재 정수값 ?");
		int y = in.nextInt();
		System.out.printf("%d*%d은 %d입니다.\n", x,y,x*y);
		in.close();
	}

}
