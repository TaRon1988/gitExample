package daily_Test;

public class Person2 {
	private String name;
	private String eMail;
	private String adress;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("이름 : " + name + "\n" + "나이 : " + age + "\n" + 
	"이메일 : " + eMail + "\n" + "주소 : " + adress);
	}
	
}
