package November11.ch02;

public class CharBoolEx {

	public static void main(String[] args) {
		char ga1 = '가';
		char ga2 = '\uAC00';
		boolean cham = true;//boolean에는 true,false 값만 저장 가능
		boolean geojit = false;

		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham+"가 아니면"+geojit+"입니다.");
		
	}

}
