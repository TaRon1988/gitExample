package daily_Test;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		String name;
		int kor = 0;
		int eng = 0;
		int mat = 0;
		char grade = ' ';
		String name2;
		int kor2 = 0;
		int eng2 = 0;
		int mat2 = 0;
		char grade2 = ' ';
		String name3;
		int kor3 = 0;
		int eng3 = 0;
		int mat3 = 0;
		char grade3 = ' ';
		
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 점수: ");
		kor = sc.nextInt();
		System.out.println("수학 점수: ");
		eng = sc.nextInt();
		System.out.println("영어 점수: ");
		mat = sc.nextInt();

		System.out.println("이름 : ");
		name2 = sc.next();
		System.out.println("국어 점수: ");
		kor2 = sc.nextInt();
		System.out.println("수학 점수: ");
		eng2 = sc.nextInt();
		System.out.println(" 점수: ");
		mat2 = sc.nextInt();

		System.out.println("이름 : ");
		name3 = sc.next();
		System.out.println("국어 점수: ");
		kor3 = sc.nextInt();
		System.out.println("수학 점수: ");
		eng3 = sc.nextInt();
		System.out.println("영어 점수: ");
		mat3 = sc.nextInt();
		sc.close();
		
		
		int tot = kor+eng+mat;
		double avg = tot/3.0; 
		int tot2 = kor2+eng2+mat2;
		double avg2 = tot2/3.0; 
		int tot3 = kor3+eng3+mat3;
		double avg3 = tot3/3.0; 
		
		if(avg > 90) {
			grade = '수';
		}else if(avg > 80) {
			grade = '우';
		}else if(avg > 70) {
			grade = '미';
		}else if(avg > 60) {
			grade = '양';
		}else {
			grade = '가';
		}
		
		
		if(avg2 > 90) {
			grade2 = '수';
		}else if(avg2 > 80) {
			grade2 = '우';
		}else if(avg2 > 70) {
			grade2 = '미';
		}else if(avg2 > 60) {
			grade2 = '양';
		}else {
			grade2 = '가';
		}
		
		
		if(avg3 > 90) {
			grade3 = '수';
		}else if(avg3 > 80) {
			grade3 = '우';
		}else if(avg3 > 70) {
			grade3 = '미';
		}else if(avg3 > 60) {
			grade3 = '양';
		}else {
			grade3 = '가';
		}
		System.out.println("========================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",name,kor,eng,mat,tot,avg,grade);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",name2,kor2,eng2,mat2,tot2,avg2,grade2);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",name3,kor3,eng3,mat3,tot3,avg3,grade3);
		System.out.println("========================");
	}

}