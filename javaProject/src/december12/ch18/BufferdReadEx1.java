package december12.ch18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferdReadEx1 {
	
public static void main(String[] args) {
	
	InputStream is = System.in;
	InputStreamReader isr = new InputStreamReader(is);
	//is inputStream 의 참조 변수라는 의미
	BufferedReader br = new BufferedReader(isr);
	//Buffered계열(Reader계열(Stream))형태로 구성
	
	System.out.print("문자열 한줄을 입력하세요 : ");
	String line;
	try {
		line =br.readLine();//문자열 한줄 입력 받기
		System.out.println("입력한 문자열 : "+line);
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("프로그램 종료");
}
}
