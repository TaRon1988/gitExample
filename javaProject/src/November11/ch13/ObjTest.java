package November11.ch13;

public class ObjTest {
	public static void main(String[] args) {
		int a = 10;//기본 자료형
		Object obj=20;//좌:부 = 우:자 (다형성 )(객체 타입)(참조 자료형)
		
		a = (Integer)obj;//정상적인 형변환
		a = (int)obj;
		//원래는 obj가 객체형이기 때문에 기본자료형(int)로 하면 안된다.
		//하지만 최신버전에서는 허용
		
		System.out.println(a);
		//Object 배열 : 다양한 자료형 사용 가능
		Object[] obj2= {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object 객체 (Integer,Double,Boolean등...)가 되어버린다.
		//(오토박싱)
		//그래서 메모리 낭비가 심하다. 이렇게 쓰는 일은 없다. 
		//대신 컬렉션처리(ArrayList등...)를
		//사용하면 단점 보완할 수 있다.
		
		//객체 타입은 향상된 for문을 이용한다 for~each,확장 for문
		
		for(Object o : obj2) {
			System.out.println(o);//오토 언박싱
		}
		
				
		}
	}


