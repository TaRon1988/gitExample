package daily_Test;

public class PersonUse2 {
	public static void main(String[] args) {
		Person2 info = new Person2();
		
		info.setName("홍길동");
		info.setAge(30);
		info.seteMail("hong@naver.com");
		info.setAdress("서울 강남구 역삼동");
		info.print();
		
		System.out.println();
		
		Person2 info2 = new Person2();
		info2.setName("사임당");
		info2.setAge(25);
		info2.seteMail("saimdang@gmail.com");
		info2.setAdress("서울 강남구 서초동");
		info2.print();
	}
}
