package November11.ch12;

import November11.ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		//인터페이스는 기본적으로 new해서 객체 생성을 할 수가 없다 =>하지만 무명클래스로의 형태로
		//생성할 수 있다.
		Flyer f=new Flyer() {//new 생성자() { }; =>무명 내부 클래스 
			//InnerUse 클래스 안에 클래스에 있기에 
			//내부 클래스이다.
			//무명 내부 클래스 특징은 중괄호 뒤에 ; 이 있다.			
			@Override
			public void takeOff() {
				System.out.println("take off");
			}
			
			@Override
			public void land() {
				System.out.println("land");
				
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
				
			}
		};//무명 내부 클래스
		f.takeOff();
		f.land();
		f.fly();
		}
	}


