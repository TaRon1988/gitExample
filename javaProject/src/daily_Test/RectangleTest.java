package daily_Test;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		float x;
		float y;
		float Rectangle;
	
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		x= input.nextFloat();
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		y= input.nextFloat();
		
		Rectangle= x*y;
		System.out.print("직사각형의 넓이는 "+Rectangle+"입니다.");
		input.close();

	}

}
