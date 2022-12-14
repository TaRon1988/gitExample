package November11.ch04;

public class Do_While_Ex2 {

	public static void main(String[] args) {
		int n=1;//초기식
		do{//먼저 실행
			System.out.println(n+"Hello Whrld");//반드시 한번은 수행되야 함
			n++;//증감식
		}while(n<=10);//조건식 (나중에 검사),주의점 do~while문에서 while();세미콜론 반드시 찍어야함
		System.out.println("while 문을 빠져 나옴");
		}

}
