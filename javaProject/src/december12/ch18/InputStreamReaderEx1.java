package december12.ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//InputStream : 1바이트 단위로 읽음
	//InputStreamReader : 문자 단위(2Byte)로 읽음 그래서 한글도 출력할 수 있다.
	public static void main(String[] args) {
		InputStream is = System.in;//1byte
		InputStreamReader isr = new InputStreamReader(is);//2byte(한글 처리가능)
		System.out.println("한글자를 입력하세요 : ");
		try {
			int code = isr.read();
			System.out.println("code : "+code);
			char ch = (char)code;
			System.out.println("char : "+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//글자의 코드 값
	}

}
