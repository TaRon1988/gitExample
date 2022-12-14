package daily_Test;

public interface Controllable {
	
	default void On() {
		System.out.println("노트북을 켠다");
	}
	default void Off() {
		System.out.println("노트북을 끈다");
	}	
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {
		System.out.println("장비를 초기화 한다.");
	}

	void turnOn();
	void turnOff();
}
