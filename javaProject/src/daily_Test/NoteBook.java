package daily_Test;

public class NoteBook implements Controllable {
	
	public static void main(String[] args) {
		NoteBook n = new NoteBook();
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}

}
