package November11.ch02;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date n = new Date();//현재 요일,월,날짜,시간,한국 표준시,연도

		String str = "tete";
		System.out.println(n +"\n");
		System.out.println(String.format("%%tF(yyyy-MM-dd): %tF", n));
		System.out.println(String.format("%%tT(02H:02m:02s): %tT, %%tR(02H:02m): %tR", n, n));
		System.out.println(String.format("%%ty(2y): %ty, %%tY(4y): %tY", n, n));		
		System.out.println(String.format("%%tm(02M): %tm", n));		
		System.out.println(String.format("%%td(02d): %td, %%te(d): %te", n, n));

		System.out.println(String.format("%%tH(02H): %tH", n));
		System.out.println(String.format("%%tM(02m): %tM", n));
		System.out.println(String.format("%%tS(02s): %tS", n));

		System.out.println(String.format("%%tZ(time zone): %tZ, %%tz(time zone offset): %tz", n, n));
		
		System.out.println(String.format("%s_", str));
		System.out.println(String.format("%12s_", str));
		System.out.println(String.format("%-12s_", str));
		System.out.println(String.format("%.2s_", str));
		System.out.println(String.format("%-12.2s_", str));
		System.out.println(String.format("%12.2s_", str));

	}
}
