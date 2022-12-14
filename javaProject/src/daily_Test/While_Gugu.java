package daily_Test;
import java.util.Scanner;
public class While_Gugu {

		public static void main(String[] args) {

			int dan=2;
			int j=1;
			
			Scanner GuguDan = new Scanner(System.in);
			System.out.print("구구단 : ");
			dan = GuguDan.nextInt();

			{
			while(dan<=9) {
				System.out.println("\n"+"** "+dan+" 단 **");
				while(j<=9) {
					System.out.println(dan+" x "+j+" = "+ (dan*j));
					j++;
				}
				j=1;
				dan++;
                break;
			}	
		}
	}
}