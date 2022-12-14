package November11.ch04;

public class GuguDan3 {

	public static void main(String[] args) {
		int dan=2;
		int j=1;
		while(dan<=9) {
			System.out.println("\n"+"** "+dan+" 단 **");
			while(j<=9) {
				System.out.printf(dan+" x "+j+" = "+ (dan*j)+"\t");
				j++;
			}
			j=1;
			dan++;
		}
	}
}
