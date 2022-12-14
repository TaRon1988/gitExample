package daily_Test;

interface Member2{
	
	void line(String line);
	void num(int num);
	void name(String name);
	void Email(String email);
}

public class MemberAnony implements Member2{
	public static void main(String[] args) {
		
		Member2 Mb = new Member2() {
				
				@Override
				public void line(String line) {
					System.out.println("-----------------------------");
					
				}
				
				@Override
				public void num(int num) {
					System.out.println("고객 번호 : "+num);
					
				}
				
				@Override
				public void name(String name) {
					System.out.println("고객 이름 : "+name);
					
				}
				
				@Override
				public void Email(String email) {
					System.out.println("이메일 : "+email);
					
				}
			
		};
		Mb.line("");
		Mb.num(2);
		Mb.name("김길동");
		Mb.Email("kim@gmail.com");
		Mb.line("");
		
	}

}
