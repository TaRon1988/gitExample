package November11.ch04;

public class breakEx3 {

	public static void main(String[] args) {
		int sum=0;
		int i =0;
		while(true) {
			if(sum>100) break;//반복문을 종료시킴
			i++;
			sum+=i;//sum=sum+i
		}
		System.out.println("i"+i);
		System.out.println("sum="+sum);
	}

}
