package daily_Test;

public class Auction {
	private String name;
	private String ID;
	private int pay;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getGrade() {
		if(pay > 100000) grade = "gold";
		else grade = "silver";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("이름 \t 아이디 \t 구매금액 \t 등급");
		System.out.println(name + "\t" + ID + "\t " + pay + "\t\t " + getGrade());
	}

}
