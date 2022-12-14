package daily_Test;

class Outer{
		class InstanceInner{
			int a=1;
		}
		static class StaticInner{
			String Email = "hong@gmail.com";
			static String name="홍길동";
		}
		void myMethod() {
			System.out.println("-----------------------------");
		}
	}
	public class MemberOuter {
		public static void main(String[] args) {
			Outer oc=new Outer();
			Outer.InstanceInner num =oc.new InstanceInner();

			System.out.println("-----------------------------");
			System.out.println("고객번호  : "+num.a);
			System.out.println("이름: "+Outer.StaticInner.name);

			Outer.StaticInner e = new Outer.StaticInner();
			System.out.println("E-mail : "+e.Email);
			
			oc.myMethod();
		}

	}

