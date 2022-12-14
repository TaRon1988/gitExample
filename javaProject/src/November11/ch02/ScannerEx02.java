package November11.ch02;
import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name =scan.next();
		System.out.print("나이를 입력하세요 : ");
		Short age= scan.nextShort();
		System.out.print("소지한 현금의 금액를 입력하세요 : ");
		int money = scan.nextInt();
		System.out.print("집에서 직장까지의 거리를 m 단위로 입력하세요 : ");
		long distance = scan.nextLong();
		System.out.print("신장(키)를 입력하세요 : ");
		float height = scan.nextFloat();
		System.out.print("당신의 몸무게는 : ");
		double weight = scan.nextDouble();
		System.out.println("========================= ");
		System.out.print("당신의 이름은 "+ name+"입니다");
		System.out.print("당신의 나이는 "+ age+"입니다");
		System.out.print("당신의 현금은"+money+"입니다");
		System.out.print("당신의 직장까지의 거리는 "+ distance+"입니다");
		System.out.print("당신의 신장은"+ height+"cm입니다");
		System.out.print("당신의 몸무게는 "+ weight+"입니다");

		scan.close();
	}
}
