package daily_Test;

public class Boat implements Vehicle {

	@Override
	public void SpeedUp() {
		System.out.println("Boat SpeedUp");
	}

	@Override
	public void SpeedDown() {
		System.out.println("Boat SpeedDown");
	}

	@Override
	public void Handling() {
		System.out.printf("Boat Handling");
	}
}
