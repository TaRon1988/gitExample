package daily_Test;

public class OverloadEx3 {
	public static void main(String[] args) {
		print("이과장",560,0,0);

	}

	static void print(String name, int pay, double tax,double realp) {
		tax = pay*0.3;
		System.out.println("================");
		System.out.println("이름\t급여\t세금\t실수령액");


		System.out.println(name+"\t"+pay+"\t"+tax+String.format("%.1f",pay-tax));
		System.out.println("================");

	}



}
