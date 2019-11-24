package guess_the_letter;

public class Player implements Comparable<Player> {
	
	private int score;
	private String name;
	
	public Player(String name, int score) {
		super();
		this.score = score;
		this.name = name.toUpperCase();
	}

	/*		setters and getters		*/
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + "\t" + this.getScore() + "\n";
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return ((Integer)this.getScore()).compareTo((Integer)o.getScore());
	}
}
