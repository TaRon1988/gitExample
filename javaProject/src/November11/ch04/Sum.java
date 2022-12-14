package November11.ch04;


public class Sum {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<=10; i++) {
			if( i% 2 == 1 )
			sum += i;//sum=sum+i 와 같음
		}
	
		System.out.printf("1부터 10사이의 홀 수의 합은? %d\n", sum);
	}
}
