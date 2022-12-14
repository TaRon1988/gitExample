package daily_Test;


public class Plane implements Vehicle {


		@Override
		public void SpeedUp() {
			System.out.println("Plane SpeedUp");
		}

		@Override
		public void SpeedDown() {
			System.out.println("Plane SpeedDown");
		}

		@Override
		public void Handling() {
			System.out.printf("Plane Handling");
		}
	}
