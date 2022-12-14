package November11.ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i =97;
		int d = 3000;
		String s = "java";
		double f = 3.14;
		
		System.out.printf("%d\n", i);//10진수
		System.out.printf("%o\n", i);//8진수
		System.out.printf("%x\n", i);//16진수
		System.out.printf("%c\n", i);//ch형 문자형
		System.out.printf("%5d\n", d);//왼쪽에 5칸 띄어서 10진수 표현
		System.out.printf("%-5d\n", d);//우측에 5칸 뛰어서 10진수 표현
		System.out.printf("%05d\n", d);//왼쪽의 자릿수를 0으로 띄워서 10진수 표현
		System.out.printf("%,d\n", d);//3자리 마다 콤마 처리
		System.out.printf("%,d\n", d);
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%,f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.14f\n", f);
		System.out.println(String.format("%4.1f", f));
		System.out.printf("%.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		int a=3, b=5;
		System.out.printf("a%%b=%d\n", a%b);//% 기호도 표현 하고 싶으면 2번 입력
	}

}
