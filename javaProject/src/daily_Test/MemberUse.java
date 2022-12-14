package daily_Test;

import java.util.Scanner;

public class MemberUse {
	public static void main(String[] args) {
		
		String name = "";
		String ID = "";
		int money = 0;
			Scanner scan=new Scanner(System.in);
			System.out.print("이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("ID를 입력하세요 : ");
			ID = scan.next();
			System.out.print("금액을 입력하세요 : ");
			money = scan.nextInt();

			scan.close();

		
		Member m1 = new Member(name,ID,money);
		m1.print();
	}

}
