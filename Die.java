import java.util.concurrent.ThreadLocalRandom;

public class Die {

	private int currentSide;
	private String name;

	public int throwDie() {
		this.currentSide = ThreadLocalRandom.current().nextInt(1, 7);
		return this.currentSide;
	}

	public Die(int currentSide) {
		this.currentSide = currentSide;
	}

	public int getCurrentSide() {
		return currentSide;
	}

	public void setCurrentSide(int currentSide) {
		this.currentSide = currentSide;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
