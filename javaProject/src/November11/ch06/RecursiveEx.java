package November11.ch06;

public class RecursiveEx {
//재귀호출 - 실제 잘 사용 안함(이유: 잘 못 활용하면 메모리 증가)
	//factorial 계산: 5!5x4x3x2x1
	static long fact1(int n) {//5
		return n==1 ? 1:n*fact1(n-1);//5x4x3x2x1
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));
		}

	}


