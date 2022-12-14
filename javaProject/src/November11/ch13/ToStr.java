package November11.ch13;

public class ToStr {
	public static void main(String[] args) {
		Object obj = new Object();//데이터 타입으로는 오브젝트 타입
		obj = new Integer(20);//좌:부, 우:자=>다형성
		//참조 변수에는 원래 주소 값이 들어가지만 jdk1.5부터는 value(값)가 
		//들어갈 수 있도록 내부처리(intValue())등의 호출)(Auto Boxing처리)
		//obj=20;
		System.out.println(obj);//객체 => 일반 (Auto UnBoxing처리)
		obj=new Double(20.5);
		//obj=20.5
		System.out.println(obj);
		//obj=new String("hello");
		obj = "hello";
		System.out.println(obj);
		
		
	}

}
