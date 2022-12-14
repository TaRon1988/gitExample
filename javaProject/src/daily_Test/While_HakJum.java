package daily_Test;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		
		int kor,eng,mat,tot = 0;
		double avg = 0.0;
		String grade = "";
		String result = ""; 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int i =1; 
		while(i<=3) {
			++i;
			System.out.print("국어점수 : ");
			kor = sc.nextInt();
			System.out.print("영어점수 : ");
			eng = sc.nextInt();
			System.out.print("수학점수 : ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = tot/3.0;
			
			if(avg>=90) {
				grade="수";
			}else if(avg>=80) {
				grade="우";
			}else if(avg>=70) {
				grade="미";
			}else if(avg>=60) {
				grade="양";
			}else {
				grade="가";
			}
			
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f", avg)+"\t"+grade+"\n";
			
		}
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(result);
		System.out.println("================================================");
	
		
	}

}