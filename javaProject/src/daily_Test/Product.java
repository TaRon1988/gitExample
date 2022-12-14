package daily_Test;

import java.util.Scanner;

public class Product {
	private String model;
	private String name;
	private String prass;
	private int price;
	private int amount;
	private int money;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("제품번호 : ");
		model=scan.next();
		System.out.println("제품명 : ");
		name=scan.next();		
		System.out.println("제조사 : ");
		prass=scan.next();
		System.out.println("단가 : ");
		price=scan.nextInt();
		System.out.println("수량 : ");
		amount=scan.nextInt();
		
		money = price*amount;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrass() {
		return prass;
	}

	public void setPrass(String prass) {
		this.prass = prass;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Product() {
		super();

	}

	
}