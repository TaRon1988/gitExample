package November11.ch02;

import java.util.Scanner;
public class Add_Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//이 위로는 지역 변수 초기화
		int x;
		int y;
		int sum;
		String num;
		
		//지역 변수 초기화(변수에 저장)
		System.out.print("첫 번째 숫자를 입력하세요:");
		x= input.nextInt();//정수형 int는 nextInt로 입력 받는다
		System.out.print("두 번째 숫자를 입력하세요:");
		y= input.nextInt();
		System.out.print("한글을 입력하세요:");
		num= input.next();//문자열은 next()로 입력 받는다
		
		sum= x+y;
		System.out.print(sum);
		System.out.print(num);
		input.close();

	}

}
