package daily_Test;


public class AutoBox {
	public static void main(String[] args) {
		//기본자료형
		int num1=30;
		int num2;
		int num3;
		
		//참조자료형
		Integer i1;
		Integer i2=new Integer(40);
		Integer i3=new Integer(50);
		
		i1 = num1;
		num2 = i2;
		num3 = i3;
		
		System.out.println("기본 자료형 : "+num1+",객체 자료형 : "+i1);
		System.out.println("기본 자료형 : "+num2+",객체 자료형 : "+i2);
		System.out.println("기본 자료형 : "+num3+",객체 자료형 : "+i3);

	}

}
