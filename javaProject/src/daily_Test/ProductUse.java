package daily_Test;

import java.util.ArrayList;
import java.util.List;



public class ProductUse {
	public static void main(String[] args) {
	String line = "------------------------------------------------------------";
	List<Product>list = new ArrayList<Product>();
	System.out.println("2개의 제품정보를 입력하세요!");
	Product m1 = new Product();
	m1.input();
	Product m2 = new Product();
	m2.input();

	list.add(m1);
	list.add(m2);
	System.out.println(line);
	System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
	System.out.println(line);
	for(int i = 0; i<list.size();i++) {
		Product m=list.get(i);
	System.out.println(m.getModel()+"\t"+m.getName()+
			"\t"+m.getPrass()+"\t"+m.getPrice()+"\t"+m.getAmount()+"\t"+m.getMoney());
	}
	System.out.println(line);

	}
}
