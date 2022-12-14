package November11.ch02;

public class Light {

	public static void main(String[] args) {
		//롱타입은 8byte
		//bit로는 (64) 정수를 저장
		long lightseed;
		long distance;
		
		lightseed=300000L;//L은 생략가능
		distance= lightseed*365L*24*60*60;
		//빛이 1년 간 이동하는 거리 = 빛의 속도 *365일*60분*60초
		System.out.println("빛이 1년 동안 가는 거리:"+distance+"km");
		
	}

}
