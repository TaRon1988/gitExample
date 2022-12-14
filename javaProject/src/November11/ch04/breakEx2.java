package November11.ch04;

public class breakEx2 {

	public static void main(String[] args) {
		int i=1;
		while(i>10) {//무한반복
			if(i==5) break;//반복문을 종료시킴
			System.out.println("i="+i);
			i++;
		}
		System.out.println("반복문 종료");
	}

}
