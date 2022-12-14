package November11.ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="kim,20,180,55,서울,학생";//A방식
		String[] items = str.split(",");//콤마를 기준으로 데이터를 분리"/"로 했으면 /기준으로 데이터를 분리
		for(String s : items) {//items 는 참조 변수
			System.out.println(s);
		}
		
		StringTokenizer st=new StringTokenizer(str,",");//B방식
		int cnt =st.countTokens();//토큰의 갯수
		System.out.println("토큰의 갯수 : "+cnt);
		while(st.hasMoreElements()) {//다음 토큰이 있을 때까지 반복
			System.out.println(st.nextToken());//토큰하나를 가져와 리턴
		}
}
}
