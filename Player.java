public class Player implements IDie {

	private String name;

	@Override
	public int throwDie(Die die) {
		return die.throwDie();
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
