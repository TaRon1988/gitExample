package November11.ch13;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1 =new StringBuilder();//최신 버전
		//StringBuffer str1 =new StringBuffer();
		str1.append("java");//문자열 내용 추가, 메모리 절약
		System.out.println(str1.toString());
		str1.append("programming");
		System.out.println(str1);
		str1.replace(0, 4, "jsp");//0~3 인덱스 내용을 변경 (java->jsp)
		//참고로 replace()메소드는 주로 String객체의 replace()를 많이 쓰는 편이다.
		System.out.println(str1);
		String str2 = str1.substring(3);
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder를 String으로 바꿀 때는 toString()을 사용 (중요)
		String str3 = str1.toString();
		//String str3 = str1; 에러
		System.out.println("StringBuilder(str1) -> String(str3)에 저장 : "+str3);
		//str1 = str3;
		//String을 StringBuilder에 저장할 때
		str1 = new StringBuilder(str3);
		System.out.println("String(str3) -> StringBuilder(str1)에 저장"+str1);
	}

}
