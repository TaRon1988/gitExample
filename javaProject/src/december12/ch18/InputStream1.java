package december12.ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStream1 {
	//스트림(Stream) : 데이터의 논리적인 통로
	//~Stream 객체들은 기본적으로 1byte단위로 스트림 처리하며, 영문 대소문자, 숫자, 특수문자만 처리 할 수 있다.(한글처리 불가)
	//InputStream(입력 스트림)
	//OutputStream(출력스트림)
	public static void main(String[] args) {
		//프로그램 <= 키보드
		InputStream is =System.in;//대표적 인풋 스트림
		System.out.println("문자를 입력하세요: ");
		try {//입출력, 네트워크, DB는 필수적 예외처리
			int code = is.read();//read함수는 키보드로부터 1byte을 읽음. 
			//한글(2byte)은 처리가 안됨.
			System.out.println(code);
			char ch = (char)code;//강제 형변환 필요, 모든 문제에는 고유한 숫자코드가 있다
			//따라서 int형 code를 char형으로 형변환해서 코드값을 문자값으로 볼 수도 있다.
			System.out.println("char : "+ch);
			
		} catch (IOException e) {//입출력 관련 예외 처리
			e.printStackTrace();
		}
		
	}

}
