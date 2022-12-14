package december12.ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//PrintStream 객체를 부모타입인 OutputStream으로 받아 처리
		//OutputStream도 1byte 처리 스트림.(한글x)
		try {
			os.write(97);//a
			os.write(98);
			os.write(99);
			os.flush();//flush()메소드를 써야 출력까지 된다.
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
