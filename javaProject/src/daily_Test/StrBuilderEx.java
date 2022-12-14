package daily_Test;


public class StrBuilderEx {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		
		str1.append("i am a");
		str2.append(" Java Programmer");
		
		str1.append(str2);
		System.out.println("append()메소드를 활용 : " + str1);
		
		str1.replace(7, 11, "JSP");
		System.out.println("replace()메소드를 활용 : " + str1);
		
		String str3 = str1.substring(7);
		System.out.println("substring()을 활용 : " +str3);
		
		
		
	}
}
