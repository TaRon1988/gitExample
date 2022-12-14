package November11.ch03;

public class AndOrEx {
//논리 연산자 &&(and),||(or)
	public static void main(String[] args) {
		int a=7;
		System.out.println(a>5&& a< 0); //true && false => false
		System.out.println(a>5 || a< 0); //true && false => true
	}
}
