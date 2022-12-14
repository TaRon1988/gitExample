package daily_Test;

import java.util.Scanner;

public class Jumsoo {
	public static void main(String[] args) {

		String name;
		int Java, DB, HTML, JSP,tot;
		double avg;

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next(); 
		System.out.print("Java 점수는? : ");
		Java = scan.nextInt();
		System.out.print("DB 점수는? : ");
		DB = scan.nextInt();
		System.out.print("HTML 점수는? : ");
		HTML = scan.nextInt();
		System.out.print("JSP 점수는? : ");
		JSP = scan.nextInt();

		scan.close();
		
	
		tot = Java + DB + HTML +JSP ;
		avg = tot / 3.0;
		
		
		System.out.println("=========================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("----------------------------------------------");
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%d\t%.1f", name,Java,DB,HTML,JSP,tot,avg));
		System.out.println("=========================");
	
		}
}

