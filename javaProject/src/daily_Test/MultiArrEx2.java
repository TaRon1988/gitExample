package daily_Test;


import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		//3행2열의 배열
		String[][] words= {{"chair","의자"}//words[0][0], words[0][1] 
		,{"computer","컴퓨터"}//words[1][0], words[1][1] 
		,{"integer","정수"}};//words[2][0], words[2][1] 
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(num==-1)for(int i=0; i<words.length; i++) {
			System.out.printf("문제%d) %s의 뜻은?", i+1, words[i][0]);
			String tmp=scanner.next();
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1] );
			}
		scanner.close();
		}

		
	}
	int num = 0;
}
