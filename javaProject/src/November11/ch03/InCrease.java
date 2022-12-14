package November11.ch03;

public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j	=	0;
		j= i++;//1의 값을 나중에 증가 시킴(나중에 계산)후위형
		System.out.println(i+","+j);
		
		i = 5;
		j	=	++i;//i의 값을 1증가 시킴(먼저 계산)전위형
		System.out.println(i+","+j);
		
	}

}
